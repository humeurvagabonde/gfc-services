/*
 * Copyright COCKTAIL (www.asso-cocktail.fr), 1995, 2017 This software 
 * is governed by the CeCILL license under French law and abiding by the
 * rules of distribution of free software. You can use, modify and/or 
 * redistribute the software under the terms of the CeCILL license as 
 * circulated by CEA, CNRS and INRIA at the following URL 
 * "http://www.cecill.info". 
 * As a counterpart to the access to the source code and rights to copy, modify 
 * and redistribute granted by the license, users are provided only with a 
 * limited warranty and the software's author, the holder of the economic 
 * rights, and the successive licensors have only limited liability. In this 
 * respect, the user's attention is drawn to the risks associated with loading,
 * using, modifying and/or developing or reproducing the software by the user 
 * in light of its specific status of free software, that may mean that it
 * is complicated to manipulate, and that also therefore means that it is 
 * reserved for developers and experienced professionals having in-depth
 * computer knowledge. Users are therefore encouraged to load and test the 
 * software's suitability as regards their requirements in conditions enabling
 * the security of their systems and/or data to be ensured and, more generally, 
 * to use and operate it in the same conditions as regards security. The
 * fact that you are presently reading this means that you have had knowledge 
 * of the CeCILL license and that you accept its terms.
 */
package org.cocktail.gfc;

import java.util.Properties;

import javax.sql.DataSource;

import org.cocktail.gfc.common.beans.Application;
import org.cocktail.gfc.common.beans.date.support.CktlGFCDateService;
import org.cocktail.gfc.common.beans.date.support.DateService;
import org.cocktail.gfc.common.spring.DatabaseConfig;
import org.cocktail.gfc.common.spring.StaticBeanFactoryProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@ComponentScan("org.cocktail")
public class MacroserviceConfig {

    @Bean
    public StaticBeanFactoryProvider staticBeanFactoryProvider() {
        return new StaticBeanFactoryProvider();
    }

    @Bean
    Application application() {
        return new Application("Macroservice");
    }

    @Bean
    @Primary
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "dataSourceNT") // Sans le Name on ne passe pas dans la méthode !
    @Primary
    public DataSource dataSource(Application application, Properties properties) {
        //On veut utiliser le code de DatabaseConfig pour construire la datasource 
        DatabaseConfig databaseConfig = new DatabaseConfig();
        // mais on renseigne les paramètres utilisé par DatabaseConfig avec la config NT
        System.setProperty(DatabaseConfig.MAXIMUM_POOL_SIZE, "" + 5);
        System.setProperty(DatabaseConfig.DB_CONNECT_PASSWORD_GLOBAL, "grhum");
        System.setProperty(DatabaseConfig.DB_CONNECT_PASSWORD_GLOBAL_ENCRYPTED, "false");
        System.setProperty(DatabaseConfig.DB_CONNECT_URLGLOBAL, "jdbc:oracle:thin:@bdoradev3.intra-cocktail.org:5221:devict01");
        System.setProperty(DatabaseConfig.DB_CONNECT_USER_GLOBAL, "grhum");
        return databaseConfig.dataSource(application);
    }

    @Bean
    DateService dateService() {
        return new CktlGFCDateService();
    }
}

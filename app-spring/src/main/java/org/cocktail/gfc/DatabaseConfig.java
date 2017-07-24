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

import javax.inject.Inject;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.support.nativejdbc.SimpleNativeJdbcExtractor;
import org.springframework.transaction.PlatformTransactionManager;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableConfigurationProperties(CktlDatasourceProperties.class)
public class DatabaseConfig {
    
    private static final String PARAM_KEY_DEBUGSQL_ENABLE = "debugsql.enable";
    private static final String PARAM_KEY_DEBUGSQL_HOST = "debugsql.host";
    private static final String PARAM_KEY_DEBUGSQL_PORT = "debugsql.port";

    private static final Logger LOG = LoggerFactory.getLogger(DatabaseConfig.class);

    @Inject
    private Environment env;
    
    // DATASOURCE
    @Bean
    @Primary
    @ConfigurationProperties("cktl.datasource")
    public DataSourceProperties dataSourceProperties() {
        return new CktlDatasourceProperties();
    }
    
    @Bean
    public HikariDataSource dataSource(DataSourceProperties properties) {
        final HikariDataSource ds = (HikariDataSource) properties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
        Properties customProperties = new Properties();
        customProperties.put("v$session.program", "gfc-Services");
        ds.setDataSourceProperties(customProperties);
        LOG.info("Paramétrage du pool de connexion Hikari(" + ds.getPoolName() + ") avec l'url jdbc : " + ds.getJdbcUrl());
        
        return ds;
    }

    // Transactions
    @Bean
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * Les PARAM_KEY_DEBUGSQL* servent au debug de plsql Voir <a href="https://wiki.asso-cocktail.fr/doku.php?id=production:cadre_de_developpement:standards_cocktail:debug_pl_sql">Wiki</a><br>
     * Exemple de configuration (A METTRE DANS UN FICHIER Properties.local) :
     * <ul>
     * <li>Activer le debug avec SQLDeveloper --> debugsql.enable=true
     * <li>IP de la machine sur laquelle tourne SQLDeveloper accessible depuis la bdd (genre ip sur vpn pour devict01 ; ip sur le réseau virtuel si VM) --> debugsql.host=192.168.56.1
     * <li>Port de la machine sur laquelle tourne SQLDeveloper --> debugsql.port=4000
     * </ul>
     */
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        boolean isDebug = env.getProperty(PARAM_KEY_DEBUGSQL_ENABLE, Boolean.class, Boolean.FALSE);
        if (isDebug) {
            String host = env.getProperty(PARAM_KEY_DEBUGSQL_HOST);
            String port = env.getProperty(PARAM_KEY_DEBUGSQL_PORT);
            HikariDataSource ds = (HikariDataSource) dataSource;
            ds.setConnectionInitSql("call DBMS_DEBUG_JDWP.CONNECT_TCP('" + host + "', '" + port + "')");
        }
        JdbcTemplate ret = new JdbcTemplate(dataSource);
        //Le SimpleNativeJdbcExtractor permet d'utiliser les VARRAY et TABLE comme paramètres des proc PL
        ret.setNativeJdbcExtractor(new SimpleNativeJdbcExtractor());
        return ret;
    }
}

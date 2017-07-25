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

/**
 * Regroupe les clés des parametres applicatifs utilisés par l'application.
 * 
 * @author rprin
 */
public final class GFCComptaParametresApplicatifsKeys {
    public static final String LCL_USER_AUT_MODE = "org.cocktail.gfc-compta.lclUserAutMode";
    public static final String ADMIN_MAIL = "org.cocktail.gfc-compta.adminMail";
    public static final String LOG_LEVEL_SERVER = "org.cocktail.gfc-compta.logLevelServer";
    public static final String LOG_LEVEL_CLIENT = "org.cocktail.gfc-compta.logLevelClient";
    public static final String PWD_ADMIN = "org.cocktail.gfc-compta.pwdAdmin";
    public static final String DISPLAY_MESSAGE_CLIENTS = "org.cocktail.gfc-compta.messageClients";
    public static final String SHOWSQLLOGS = "org.cocktail.gfc-compta.showSQLLogs";
    public static final String SHOW_REST_LOGS = "org.cocktail.gfc-compta.showRestLogs";
    public static final String SHOWBDCONNEXIONSERVER = "org.cocktail.gfc-compta.showBDConnexionServer";
    public static final String SHOWBDCONNEXIONSERVERID = "org.cocktail.gfc-compta.showBDConnexionServerID";
    public static final String TMP_LOG_DIR = "org.cocktail.gfc-compta.repertoireTempPourLog";
    public static final String REPORTS_LOCATION = "org.cocktail.gfc-compta.repertoirePourReports";
    public static final String ZTEST_MODE = "org.cocktail.gfc-compta.testMode";
    public static final String ZEMAIL_FOR_TEST = "org.cocktail.gfc-compta.testMode.email";
    public static final String FEATURES_PATTERN = "org.cocktail.gfc-compta.features.{0}.enabled";

    public static final String GRHUM_TIME_ZONE = "GRHUM_TIME_ZONE";
    public static final String GRHUM_HOST_MAIL = "GRHUM_HOST_MAIL";
    public static final String GRHUM_PORT_MAIL = "GRHUM_PORT_MAIL";

    public static final String SAUT_URL = "SAUT_URL";
    public static final String APP_ALIAS = "APP_ALIAS";
    public static final String HTML_JSCRIPT_ROOT = "HTML_JSCRIPT_ROOT";
    public static final String HTML_IMAGES_ROOT = "HTML_IMAGES_ROOT";
    public static final String DISPLAY_SYSTEM_PROPERTIES = "DISPLAY_SYSTEM_PROPERTIES";

    private GFCComptaParametresApplicatifsKeys() {

    }

    /**
     *  Indiquer ici les noms des paramètres qui permettent d'activer une fonctionnalité
     *  mettre la string {0} de la constante FEATURES_PATTERN
     *  ex. RechercheDC ou RechercheDCr
     * @see ApplicationClient.checkFeatureEnabled
     *
     */
    public enum Feature {
    }

}

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

import static org.cocktail.auth.services.AuthenticationService.AUTH_KEY;
import static org.cocktail.auth.services.AuthenticationService.HEADER_AUTH_KEY;

import org.apache.log4j.MDC;
import org.cocktail.auth.authentification.context.AuthContextHolder;
import org.cocktail.auth.model.Auth;
import org.cocktail.fwkcktlrestservices.serveur.services.AuthenticationService;
import org.cocktail.fwkcktlwebapp.server.filter.AbstractDefaultFilter;

import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;

import er.extensions.foundation.ERXStringUtilities;

public class SessionAuthFilter extends AbstractDefaultFilter {

    private static final String MDC_USERNAME = "username";
    private static final String MDC_PERSID = "persid";
    private static final String USERNAME_ANONYME = "anonyme";
    private static final String PERSID_ANONYME = "";
    private final AuthenticationService authenticationService = new AuthenticationService();

    @Override
    public void doPreFilter(WORequest request) {
        super.doPreFilter(request);
        String username = USERNAME_ANONYME;
        String persid = PERSID_ANONYME;

        try {
            String authKey = getAuthKey(request);
            Auth authDetails = authenticationService.parseAuthKey(authKey);
            if (authDetails != null) {
                AuthContextHolder.getContext().setAuthentication(authDetails);

                username = authDetails.getUser();
                persid = authDetails.getPersId().toString();
            }
            MDC.put(MDC_USERNAME, username);
            MDC.put(MDC_PERSID, persid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPostFilter(WOResponse response) {
        super.doPostFilter(response);
        Auth authDetails = AuthContextHolder.getContext().getAuthentication();
        if (authDetails != null) {
            String authToken = authenticationService.getJwtFromAuth(authDetails);
            response.appendHeader(authToken, HEADER_AUTH_KEY);
        }
        AuthContextHolder.clearContext();
        MDC.remove(MDC_USERNAME);
        MDC.remove(MDC_PERSID);
    }

    protected String getAuthKey(WORequest request) {
        String authKey = (String) request.formValueForKey(AUTH_KEY);
        if (ERXStringUtilities.stringIsNullOrEmpty(authKey)) {
            authKey = request.headerForKey(HEADER_AUTH_KEY);
        }

        if (ERXStringUtilities.stringIsNullOrEmpty(authKey)) {
            authKey = request.cookieValueForKey(AUTH_KEY);
        }

        if (ERXStringUtilities.stringIsNullOrEmpty(authKey)) {
            authKey = request.headerForKey(AUTH_KEY);
        }
        return authKey;
    }

    private Application app() {
        return (Application) Application.application();
    }

}

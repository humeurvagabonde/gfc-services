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
package org.cocktail.macroservice.rest.server.wo;

import java.util.Set;

import org.cocktail.apt.wocontroller.runtime.AbstractWoWrapper;
import org.cocktail.fwkcktlacces.server.handler.JarResourceRequestHandler;
import org.cocktail.fwkcktlrestservices.serveur.CktlRouteRequestHandler;
import org.cocktail.fwkcktlrestservices.serveur.annotations.ControllerPath;
import org.cocktail.fwkcktlwebapp.server.CktlWebApplication;
import org.cocktail.fwkcktlwebapp.server.init.NSLegacyBundleMonkeyPatch;
import org.reflections.Reflections;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.webobjects.appserver.WOMessage;
import com.woinject.WOInject;

import er.extensions.appserver.ERXMessageEncoding;
import er.rest.routes.ERXRouteRequestHandler;

public class Application extends CktlWebApplication {

    public static void main(String[] argv) {
        NSLegacyBundleMonkeyPatch.apply();
        WOInject.init(Application.class.getCanonicalName(), argv);
    }

    public Application() {
        setAllowsConcurrentRequestHandling(true);
        setDefaultRequestHandler(requestHandlerForKey(directActionRequestHandlerKey()));
        setPageRefreshOnBacktrackEnabled(true);
        WOMessage.setDefaultEncoding("UTF-8");
        WOMessage.setDefaultURLEncoding("UTF-8");
        ERXMessageEncoding.setDefaultEncoding("UTF8");
        ERXMessageEncoding.setDefaultEncodingForAllLanguages("UTF8");
        registerRequestHandler(new JarResourceRequestHandler(), "_wr_");
    }

    @Override
    public void initApplication() {
        System.out.println("Lancement de l'application serveur " + this.name() + "...");
        super.initApplication();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MacroserviceConfig.class);
        ctx.refresh();

        CktlRouteRequestHandler routeRequestHandler = (CktlRouteRequestHandler) requestHandlerForKey(ERXRouteRequestHandler.Key);
        if (routeRequestHandler == null) {
            routeRequestHandler = new CktlRouteRequestHandler(ERXRouteRequestHandler.WO);
        }

        routeRequestHandler.getFilterChain().clear();
        routeRequestHandler.getFilterChain().registerFilter(new SessionAuthFilter());

        Reflections reflections = new Reflections("org.cocktail");
        Set<Class<?>> cktlControllers = reflections.getTypesAnnotatedWith(ControllerPath.class);
        for (Class<?> controller : cktlControllers) {
            if (AbstractWoWrapper.class.isAssignableFrom(controller)) {
                @SuppressWarnings("unchecked")
                Class<? extends AbstractWoWrapper> controllerClass = (Class<? extends AbstractWoWrapper>) controller;
                routeRequestHandler.addRoutes(controllerClass);
            }
        }
        ERXRouteRequestHandler.register(routeRequestHandler);
    }
}
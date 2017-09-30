package org.cocktail.gfc;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@Named
@Singleton
@ApplicationPath("/api/v1/gfc")
public class GfcJerseyConfig extends ResourceConfig {

    public GfcJerseyConfig() {
        // alternatives a l'enregistrement via packages : https://github.com/spring-projects/spring-boot/issues/7496
        // peut etre que je favoriserai spring MVC ou une liste des endpoints par sous projets (via registerClasses(Set)

//        packages(GfcJerseyConfig.class.getPackage().getName());

//        register(CodeAnalytiqueResource.class);
//        register(EvenementBudgetaireResource.class);
//        register(EvenementComptableResource.class);
//        register(DemandePaiementResource.class);
    }
}

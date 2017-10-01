package org.cocktail.gfc.comptabilite.budgetaire.port.adapter.rest;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Named
@Singleton
@Path("/compta-budgetaire")
@Produces(MediaType.APPLICATION_JSON)
public class EvenementBudgetaireResource {

    @GET
    @Path("/hello")
    public String hello() {
        return "Hello World!";
    }
    
}

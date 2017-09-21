package org.cocktail.gfc.comptabilite.generale.port.adapter.rest;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.cocktail.gfc.comptabilite.generale.api.HelloComptableEtBudgetaireService;
import org.cocktail.gfc.comptabilite.generale.api.ServiceDescriptor;

@Named
@Singleton
@Path("/compta-generale")
@Produces(MediaType.APPLICATION_JSON)
public class EvenementComptableResource implements ServiceDescriptor {

    @Inject
    private HelloComptableEtBudgetaireService helloComptableEtBudgetaireService;

    public String hello() {
        return helloComptableEtBudgetaireService.hello();
    }
    
}

package org.cocktail.gfc.depense.port.adapter.rest;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.cocktail.gfc.depense.application.sf.ServiceFaitApplicationService;
import org.cocktail.gfc.depense.metier.modele.sf.CodeAnalytique;

@Named
@Singleton
@Path("/codes-analytique")
@Produces(MediaType.APPLICATION_JSON)
public class CodeAnalytiqueResource {

    @Inject
    private ServiceFaitApplicationService sfAppService;
    
    @GET
    @Path("/all")
    public Iterable<CodeAnalytique> findAll() {
        return sfAppService.findAll();
    }
    
}

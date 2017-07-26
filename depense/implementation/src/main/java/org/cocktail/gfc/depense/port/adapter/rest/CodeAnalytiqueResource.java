package org.cocktail.gfc.depense.port.adapter.rest;

import org.cocktail.gfc.depense.metier.modele.codeanalytique.CodeAnalytique;
import org.cocktail.gfc.depense.metier.modele.codeanalytique.CodeAnalytiqueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.stream.StreamSupport;

@Named
@Singleton
@Path("/codes-analytique")
@Produces(MediaType.APPLICATION_JSON)
public class CodeAnalytiqueResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(CodeAnalytiqueResource.class);

    @Inject
    private CodeAnalytiqueRepository codeAnalytiqueRepository;

    @GET
    @Path("/")
    public Iterable<CodeAnalytique> findAll() {
        Iterable<CodeAnalytique> codes = codeAnalytiqueRepository.findAll();
        StreamSupport.stream(codes.spliterator(), false)
                .forEach(code -> LOGGER.info(code.getCode()));
        return codes;
    }
}

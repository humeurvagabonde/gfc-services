package org.cocktail.gfc.depense.api;

import feign.RequestLine;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

public interface ServiceDescriptor {

    interface CodeAnalytiqueDescriptor {
        @GET
        @Path("/")
        List<CodeAnalytiqueRepresentation> findAll();
    }
}

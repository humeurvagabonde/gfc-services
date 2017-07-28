package org.cocktail.gfc.depense.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public interface ServiceDescriptor {

    interface CodeAnalytiqueDescriptor {
        @GET
        @Path("/")
        Iterable<CodeAnalytiqueRepresentation> findAll();
    }
}

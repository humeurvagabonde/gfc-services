package org.cocktail.gfc.depense.api;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

public interface ServiceDescriptor {

    interface CodeAnalytiqueServiceDescriptor {
        @GET
        @Path("/")
        List<CodeAnalytiqueRepresentation> find(
                @QueryParam("code") String code,
                @QueryParam("libelle") String libelle);

        @GET
        @Path("/{code}")
        CodeAnalytiqueRepresentation getCodeAnalytique(@PathParam("code") String code);
    }

    interface DemandePaiementServiceDescriptor {
        @GET
        @Path("/{id}/valider")
        Response valider(@PathParam("id") Long idDp);

    }
}

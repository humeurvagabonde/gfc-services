package org.cocktail.gfc.depense.api;

import feign.Param;
import feign.RequestLine;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

public interface ServiceDescriptor {

    interface CodeAnalytiqueDescriptor {
        @GET
        @Path("/")
        @RequestLine("GET /api/v1/gfc/codes-analytique?code={code}&libelle={libelle}")
        List<CodeAnalytiqueRepresentation> find(
                @QueryParam("code") @Param("code") String code,
                @QueryParam("libelle") @Param("libelle") String libelle);

        @GET
        @Path("/{code}")
        @RequestLine("GET /api/v1/gfc/codes-analytique/{code}")
        CodeAnalytiqueRepresentation getCodeAnalytique(@PathParam("code") @Param("code") String code);
    }
}

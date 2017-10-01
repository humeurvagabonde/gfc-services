package org.cocktail.gfc.comptabilite.generale.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public interface ServiceDescriptor {

    @GET
    @Path("/hello")
    String hello();

}
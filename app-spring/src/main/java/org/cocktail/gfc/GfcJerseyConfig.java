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
        packages(GfcJerseyConfig.class.getPackage().getName());
    }

}

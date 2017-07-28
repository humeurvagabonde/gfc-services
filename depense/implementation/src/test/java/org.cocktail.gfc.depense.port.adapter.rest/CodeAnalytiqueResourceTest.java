package org.cocktail.gfc.depense.port.adapter.rest;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.jaxrs.JAXRSContract;
import org.cocktail.gfc.depense.api.CodeAnalytiqueRepresentation;
import org.cocktail.gfc.depense.api.ServiceDescriptor;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class CodeAnalytiqueResourceTest {

    @Test
    @Ignore
    public void findAll() throws Exception {
        ServiceDescriptor.CodeAnalytiqueDescriptor desc =
            Feign.builder()
                .contract(new JAXRSContract())
                .decoder(new GsonDecoder())
                .logger(new feign.slf4j.Slf4jLogger())
                .logLevel(Logger.Level.FULL)
                .target(ServiceDescriptor.CodeAnalytiqueDescriptor.class, "http://localhost:9000/api/v1/gfc/codes-analytique");

        Iterable<CodeAnalytiqueRepresentation> repr = desc.findAll();

        List<CodeAnalytiqueRepresentation> reprList = StreamSupport.stream(repr.spliterator(), false).collect(Collectors.toList());
        Assert.assertEquals(38, reprList.size());
    }

}
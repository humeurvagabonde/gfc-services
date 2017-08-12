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
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
public class CodeAnalytiqueResourceTest {

    @Test
    @Ignore
    public void findAll() throws Exception {
        ServiceDescriptor.CodeAnalytiqueServiceDescriptor desc =
            Feign.builder()
                .contract(new JAXRSContract())
                .decoder(new GsonDecoder())
                .logger(new feign.slf4j.Slf4jLogger())
                .logLevel(Logger.Level.FULL)
                .target(ServiceDescriptor.CodeAnalytiqueServiceDescriptor.class, "http://localhost:9000/api/v1/gfc/codes-analytique");

        Iterable<CodeAnalytiqueRepresentation> repr = desc.find(null, null);

        List<CodeAnalytiqueRepresentation> reprList = StreamSupport.stream(repr.spliterator(), false).collect(Collectors.toList());
        Assert.assertEquals(38, reprList.size());
    }

    @Test
    @Ignore
    public void findByCode() throws Exception {
        ServiceDescriptor.CodeAnalytiqueServiceDescriptor desc =
                Feign.builder()
                        .contract(new JAXRSContract())
                        .decoder(new GsonDecoder())
                        .logger(new feign.slf4j.Slf4jLogger())
                        .logLevel(Logger.Level.FULL)
                        .target(ServiceDescriptor.CodeAnalytiqueServiceDescriptor.class, "http://localhost:9000/api/v1/gfc/");

        Iterable<CodeAnalytiqueRepresentation> repr = desc.find("AA01", null);

        List<CodeAnalytiqueRepresentation> reprList = StreamSupport.stream(repr.spliterator(), false).collect(Collectors.toList());
        Assert.assertEquals(1, reprList.size());
        Assert.assertEquals("code fils", reprList.get(0).getLibelle());
    }

    @Test
    @Ignore
    public void getCodeAnalytique() throws Exception {
        ServiceDescriptor.CodeAnalytiqueServiceDescriptor desc =
                Feign.builder()
                        //.contract(new JAXRSContract())
                        .decoder(new GsonDecoder())
                        .logger(new feign.slf4j.Slf4jLogger())
                        .logLevel(Logger.Level.FULL)
                        .target(ServiceDescriptor.CodeAnalytiqueServiceDescriptor.class, "http://localhost:9000/");

        CodeAnalytiqueRepresentation repr = desc.getCodeAnalytique("AA01");

        Assert.assertEquals("AA01", repr.getCode());
        Assert.assertEquals("code fils", repr.getLibelle());
    }
}

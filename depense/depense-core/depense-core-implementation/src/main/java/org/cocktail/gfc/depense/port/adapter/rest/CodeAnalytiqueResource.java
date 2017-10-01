package org.cocktail.gfc.depense.port.adapter.rest;

import org.cocktail.gfc.depense.api.CodeAnalytiqueRepresentation;
import org.cocktail.gfc.depense.api.ServiceDescriptor;
import org.cocktail.gfc.depense.application.mapper.ApiMappers;
import org.cocktail.gfc.depense.metier.modele.codeanalytique.CodeAnalytique;
import org.cocktail.gfc.depense.metier.modele.codeanalytique.CodeAnalytiqueQuery;
import org.cocktail.gfc.depense.metier.modele.codeanalytique.CodeAnalytiqueQueryKt;
import org.cocktail.gfc.depense.metier.modele.codeanalytique.CodeAnalytiqueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Named
@Singleton
@Path("/codes-analytique")
@Produces(MediaType.APPLICATION_JSON)
public class CodeAnalytiqueResource implements ServiceDescriptor.CodeAnalytiqueServiceDescriptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(CodeAnalytiqueResource.class);

    @Inject
    private CodeAnalytiqueRepository codeAnalytiqueRepository;

    @Override
    public List<CodeAnalytiqueRepresentation> find(String code, String libelle) {
        CodeAnalytiqueQuery codesQuery = new CodeAnalytiqueQuery(code, libelle);
        Specification<CodeAnalytique> codesSpecs = CodeAnalytiqueQueryKt.toSpecification(codesQuery);
        //Pageable pageRequest = new PageRequest(0, 10);
        Iterable<CodeAnalytique> codes = codeAnalytiqueRepository.findAll(codesSpecs);
        List<CodeAnalytiqueRepresentation> codesRepr =
                StreamSupport.stream(codes.spliterator(), false)
                .peek(c -> LOGGER.info(c.getCode()))
                .map(ApiMappers.CodeAnalytiqueMapper.INSTANCE::toApi)
                .collect(Collectors.toList());

        return codesRepr;
    }

    @Override
    public CodeAnalytiqueRepresentation getCodeAnalytique(String code) {
        Optional<CodeAnalytique> codeAnalytique = codeAnalytiqueRepository.findOne(CodeAnalytiqueQueryKt.toSpecification(new CodeAnalytiqueQuery(code, null)));
        return codeAnalytique.map(ApiMappers.CodeAnalytiqueMapper.INSTANCE::toApi).orElseThrow(IllegalArgumentException::new);
    }
}

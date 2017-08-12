package org.cocktail.gfc.depense.port.adapter.rest;

import org.cocktail.gfc.depense.api.CodeAnalytiqueRepresentation;
import org.cocktail.gfc.depense.api.ServiceDescriptor;
import org.cocktail.gfc.depense.application.dp.DemandePaiementApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Named
@Singleton
@Path("/demandes-paiement")
@Produces(MediaType.APPLICATION_JSON)
public class DemandePaiementResource implements ServiceDescriptor.DemandePaiementServiceDescriptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemandePaiementResource.class);

    @Inject
    private DemandePaiementApplicationService dpAppSrv;

    @Override
    public Response valider(Long idDp) {
        dpAppSrv.valider(idDp, 4L);
        return Response.status(Response.Status.OK).build();
    }
}



/*

    @Override
    public List<CodeAnalytiqueRepresentation> find(String code, String libelle) {
        CodeAnalytiqueQuery codesQuery = new CodeAnalytiqueQuery(code, libelle);
        Specifications<CodeAnalytique> codesSpecs = CodeAnalytiqueQueryKt.toSpecification(codesQuery);
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
        CodeAnalytique codeAnalytique =
                codeAnalytiqueRepository.findOne(CodeAnalytiqueQueryKt.toSpecification(new CodeAnalytiqueQuery(code, null)));
        return ApiMappers.CodeAnalytiqueMapper.INSTANCE.toApi(codeAnalytique);
    }
    */
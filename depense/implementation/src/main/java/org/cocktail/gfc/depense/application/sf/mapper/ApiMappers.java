package org.cocktail.gfc.depense.application.mapper;

import org.cocktail.gfc.depense.api.CodeAnalytiqueRepresentation;
import org.cocktail.gfc.depense.metier.modele.codeanalytique.CodeAnalytique;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public interface ApiMappers {

    @Mapper
    interface CodeAnalytiqueMapper {
        ApiMappers.CodeAnalytiqueMapper INSTANCE = Mappers.getMapper(ApiMappers.CodeAnalytiqueMapper.class);

        CodeAnalytiqueRepresentation toApi(CodeAnalytique code);
    }

}
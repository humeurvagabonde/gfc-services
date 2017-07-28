package org.cocktail.gfc.depense.mapper;

import org.cocktail.gfc.depense.api.CodeAnalytiqueRepresentation;
import org.cocktail.gfc.depense.metier.modele.codeanalytique.CodeAnalytique;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public interface ApiMappers {

    @Mapper
    interface CodeAnalytiqueMapper {
        CodeAnalytiqueMapper INSTANCE = Mappers.getMapper(CodeAnalytiqueMapper.class);

        CodeAnalytiqueRepresentation codeToCodeRepresentation(CodeAnalytique code);
    }
}

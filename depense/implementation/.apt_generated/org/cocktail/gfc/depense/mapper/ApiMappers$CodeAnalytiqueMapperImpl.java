package org.cocktail.gfc.depense.mapper;

import javax.annotation.Generated;

import org.cocktail.gfc.depense.api.CodeAnalytiqueRepresentation;

import org.cocktail.gfc.depense.mapper.ApiMappers.CodeAnalytiqueMapper;

import org.cocktail.gfc.depense.metier.modele.codeanalytique.CodeAnalytique;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2017-08-03T16:00:59+0200",

    comments = "version: 1.2.0.CR1, compiler: Eclipse JDT (IDE) 3.13.0.v20170516-1929, environment: Java 1.8.0_131 (Oracle Corporation)"

)

public class ApiMappers$CodeAnalytiqueMapperImpl implements CodeAnalytiqueMapper {

    @Override

    public CodeAnalytiqueRepresentation codeToCodeRepresentation(CodeAnalytique code) {

        if ( code == null ) {

            return null;
        }

        CodeAnalytiqueRepresentation codeAnalytiqueRepresentation = new CodeAnalytiqueRepresentation();

        codeAnalytiqueRepresentation.setCode( code.getCode() );

        codeAnalytiqueRepresentation.setLibelle( code.getLibelle() );

        return codeAnalytiqueRepresentation;
    }
}


package org.cocktail.gfc.depense.mapper;

import javax.annotation.Generated;

import org.cocktail.gfc.depense.api.CodeAnalytiqueRepresentation;

import org.cocktail.gfc.depense.mapper.ApiMappers.CodeAnalytiqueMapper;

import org.cocktail.gfc.depense.metier.modele.codeanalytique.CodeAnalytique;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2017-07-28T19:01:40+0200",

    comments = "version: 1.2.0.CR1, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"

)

public class ApiMappers$CodeAnalytiqueMapperImpl implements CodeAnalytiqueMapper {

    @Override

    public CodeAnalytiqueRepresentation codeToCodeRepresentation(CodeAnalytique code) {

        if ( code == null ) {

            return null;
        }

        CodeAnalytiqueRepresentation codeAnalytiqueRepresentation = new CodeAnalytiqueRepresentation();

        codeAnalytiqueRepresentation.setLibelle( code.getLibelle() );

        codeAnalytiqueRepresentation.setCode( code.getCode() );

        return codeAnalytiqueRepresentation;
    }
}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVPersonneNomPrenom is a Querydsl query type for QVPersonneNomPrenom
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVPersonneNomPrenom extends com.querydsl.sql.RelationalPathBase<QVPersonneNomPrenom> {

    private static final long serialVersionUID = 1514181693;

    public static final QVPersonneNomPrenom vPersonneNomPrenom = new QVPersonneNomPrenom("V_PERSONNE_NOM_PRENOM");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath persLc = createString("persLc");

    public final StringPath persLibelle = createString("persLibelle");

    public QVPersonneNomPrenom(String variable) {
        super(QVPersonneNomPrenom.class, forVariable(variable), "GFC", "V_PERSONNE_NOM_PRENOM");
        addMetadata();
    }

    public QVPersonneNomPrenom(String variable, String schema, String table) {
        super(QVPersonneNomPrenom.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVPersonneNomPrenom(Path<? extends QVPersonneNomPrenom> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_PERSONNE_NOM_PRENOM");
        addMetadata();
    }

    public QVPersonneNomPrenom(PathMetadata metadata) {
        super(QVPersonneNomPrenom.class, metadata, "GFC", "V_PERSONNE_NOM_PRENOM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persLc, ColumnMetadata.named("PERS_LC").withIndex(3).ofType(Types.VARCHAR).withSize(40));
        addMetadata(persLibelle, ColumnMetadata.named("PERS_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}


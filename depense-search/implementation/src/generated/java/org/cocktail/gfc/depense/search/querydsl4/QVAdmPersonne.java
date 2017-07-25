package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmPersonne is a Querydsl query type for QVAdmPersonne
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmPersonne extends com.querydsl.sql.RelationalPathBase<QVAdmPersonne> {

    private static final long serialVersionUID = 1390860554;

    public static final QVAdmPersonne vAdmPersonne = new QVAdmPersonne("V_ADM_PERSONNE");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath persLc = createString("persLc");

    public final StringPath persLibelle = createString("persLibelle");

    public final StringPath persNomptr = createString("persNomptr");

    public final NumberPath<Long> persOrdre = createNumber("persOrdre", Long.class);

    public final StringPath persType = createString("persType");

    public QVAdmPersonne(String variable) {
        super(QVAdmPersonne.class, forVariable(variable), "GFC", "V_ADM_PERSONNE");
        addMetadata();
    }

    public QVAdmPersonne(String variable, String schema, String table) {
        super(QVAdmPersonne.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmPersonne(Path<? extends QVAdmPersonne> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_PERSONNE");
        addMetadata();
    }

    public QVAdmPersonne(PathMetadata metadata) {
        super(QVAdmPersonne.class, metadata, "GFC", "V_ADM_PERSONNE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persLc, ColumnMetadata.named("PERS_LC").withIndex(5).ofType(Types.VARCHAR).withSize(40));
        addMetadata(persLibelle, ColumnMetadata.named("PERS_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(persNomptr, ColumnMetadata.named("PERS_NOMPTR").withIndex(6).ofType(Types.VARCHAR).withSize(80));
        addMetadata(persOrdre, ColumnMetadata.named("PERS_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persType, ColumnMetadata.named("PERS_TYPE").withIndex(2).ofType(Types.VARCHAR).withSize(5).notNull());
    }

}


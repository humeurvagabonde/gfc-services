package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmNatureRec is a Querydsl query type for QAdmNatureRec
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmNatureRec extends com.querydsl.sql.RelationalPathBase<QAdmNatureRec> {

    private static final long serialVersionUID = -1285475927;

    public static final QAdmNatureRec admNatureRec = new QAdmNatureRec("ADM_NATURE_REC");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmNatureRec> admNatureRecPk = createPrimaryKey(idAdmNatureRec);

    public QAdmNatureRec(String variable) {
        super(QAdmNatureRec.class, forVariable(variable), "GFC", "ADM_NATURE_REC");
        addMetadata();
    }

    public QAdmNatureRec(String variable, String schema, String table) {
        super(QAdmNatureRec.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmNatureRec(Path<? extends QAdmNatureRec> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_NATURE_REC");
        addMetadata();
    }

    public QAdmNatureRec(PathMetadata metadata) {
        super(QAdmNatureRec.class, metadata, "GFC", "ADM_NATURE_REC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(3).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


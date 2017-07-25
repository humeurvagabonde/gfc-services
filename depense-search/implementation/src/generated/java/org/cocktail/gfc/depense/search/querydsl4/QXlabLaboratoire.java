package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXlabLaboratoire is a Querydsl query type for QXlabLaboratoire
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXlabLaboratoire extends com.querydsl.sql.RelationalPathBase<QXlabLaboratoire> {

    private static final long serialVersionUID = 1646904849;

    public static final QXlabLaboratoire xlabLaboratoire = new QXlabLaboratoire("XLAB_LABORATOIRE");

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final StringPath xlabCr = createString("xlabCr");

    public final StringPath xlabEtab = createString("xlabEtab");

    public final NumberPath<Long> xlabId = createNumber("xlabId", Long.class);

    public final StringPath xlabUb = createString("xlabUb");

    public final StringPath xlabUnit = createString("xlabUnit");

    public final com.querydsl.sql.PrimaryKey<QXlabLaboratoire> xlabLaboratoirePk = createPrimaryKey(xlabId);

    public QXlabLaboratoire(String variable) {
        super(QXlabLaboratoire.class, forVariable(variable), "GFC", "XLAB_LABORATOIRE");
        addMetadata();
    }

    public QXlabLaboratoire(String variable, String schema, String table) {
        super(QXlabLaboratoire.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXlabLaboratoire(Path<? extends QXlabLaboratoire> path) {
        super(path.getType(), path.getMetadata(), "GFC", "XLAB_LABORATOIRE");
        addMetadata();
    }

    public QXlabLaboratoire(PathMetadata metadata) {
        super(QXlabLaboratoire.class, metadata, "GFC", "XLAB_LABORATOIRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(xlabCr, ColumnMetadata.named("XLAB_CR").withIndex(5).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(xlabEtab, ColumnMetadata.named("XLAB_ETAB").withIndex(3).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(xlabId, ColumnMetadata.named("XLAB_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xlabUb, ColumnMetadata.named("XLAB_UB").withIndex(4).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(xlabUnit, ColumnMetadata.named("XLAB_UNIT").withIndex(6).ofType(Types.VARCHAR).withSize(6).notNull());
    }

}


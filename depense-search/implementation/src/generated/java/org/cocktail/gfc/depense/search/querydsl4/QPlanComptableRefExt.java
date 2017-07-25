package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPlanComptableRefExt is a Querydsl query type for QPlanComptableRefExt
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPlanComptableRefExt extends com.querydsl.sql.RelationalPathBase<QPlanComptableRefExt> {

    private static final long serialVersionUID = 643327258;

    public static final QPlanComptableRefExt planComptableRefExt = new QPlanComptableRefExt("PLAN_COMPTABLE_REF_EXT");

    public final StringPath refPcoBudgetaire = createString("refPcoBudgetaire");

    public final DateTimePath<java.sql.Timestamp> refPcoDateDebut = createDateTime("refPcoDateDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> refPcoDateFin = createDateTime("refPcoDateFin", java.sql.Timestamp.class);

    public final NumberPath<Long> refPcoId = createNumber("refPcoId", Long.class);

    public final StringPath refPcoImportId = createString("refPcoImportId");

    public final StringPath refPcoLibelle = createString("refPcoLibelle");

    public final StringPath refPcoNomenclatureRef = createString("refPcoNomenclatureRef");

    public final StringPath refPcoNum = createString("refPcoNum");

    public final StringPath refPcoNumOld = createString("refPcoNumOld");

    public final StringPath refPcoRemarques = createString("refPcoRemarques");

    public final StringPath refPcoSpecificite = createString("refPcoSpecificite");

    public final StringPath refPcoSubdivisable = createString("refPcoSubdivisable");

    public final com.querydsl.sql.PrimaryKey<QPlanComptableRefExt> planComptableRefExtPk = createPrimaryKey(refPcoId);

    public QPlanComptableRefExt(String variable) {
        super(QPlanComptableRefExt.class, forVariable(variable), "GFC", "PLAN_COMPTABLE_REF_EXT");
        addMetadata();
    }

    public QPlanComptableRefExt(String variable, String schema, String table) {
        super(QPlanComptableRefExt.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPlanComptableRefExt(Path<? extends QPlanComptableRefExt> path) {
        super(path.getType(), path.getMetadata(), "GFC", "PLAN_COMPTABLE_REF_EXT");
        addMetadata();
    }

    public QPlanComptableRefExt(PathMetadata metadata) {
        super(QPlanComptableRefExt.class, metadata, "GFC", "PLAN_COMPTABLE_REF_EXT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(refPcoBudgetaire, ColumnMetadata.named("REF_PCO_BUDGETAIRE").withIndex(7).ofType(Types.VARCHAR).withSize(1));
        addMetadata(refPcoDateDebut, ColumnMetadata.named("REF_PCO_DATE_DEBUT").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(refPcoDateFin, ColumnMetadata.named("REF_PCO_DATE_FIN").withIndex(11).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(refPcoId, ColumnMetadata.named("REF_PCO_ID").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(refPcoImportId, ColumnMetadata.named("REF_PCO_IMPORT_ID").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(refPcoLibelle, ColumnMetadata.named("REF_PCO_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(refPcoNomenclatureRef, ColumnMetadata.named("REF_PCO_NOMENCLATURE_REF").withIndex(12).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(refPcoNum, ColumnMetadata.named("REF_PCO_NUM").withIndex(3).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(refPcoNumOld, ColumnMetadata.named("REF_PCO_NUM_OLD").withIndex(6).ofType(Types.VARCHAR).withSize(30));
        addMetadata(refPcoRemarques, ColumnMetadata.named("REF_PCO_REMARQUES").withIndex(5).ofType(Types.VARCHAR).withSize(2000));
        addMetadata(refPcoSpecificite, ColumnMetadata.named("REF_PCO_SPECIFICITE").withIndex(8).ofType(Types.VARCHAR).withSize(200));
        addMetadata(refPcoSubdivisable, ColumnMetadata.named("REF_PCO_SUBDIVISABLE").withIndex(9).ofType(Types.VARCHAR).withSize(1));
    }

}


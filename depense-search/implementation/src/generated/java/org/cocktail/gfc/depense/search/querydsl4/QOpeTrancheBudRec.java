package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeTrancheBudRec is a Querydsl query type for QOpeTrancheBudRec
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeTrancheBudRec extends com.querydsl.sql.RelationalPathBase<QOpeTrancheBudRec> {

    private static final long serialVersionUID = -317721126;

    public static final QOpeTrancheBudRec opeTrancheBudRec = new QOpeTrancheBudRec("OPE_TRANCHE_BUD_REC");

    public final StringPath commentaire = createString("commentaire");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final NumberPath<Long> idAdmOrigineRecette = createNumber("idAdmOrigineRecette", Long.class);

    public final NumberPath<Long> idOpeTrancheBud = createNumber("idOpeTrancheBud", Long.class);

    public final NumberPath<Long> idOpeTrancheBudRec = createNumber("idOpeTrancheBudRec", Long.class);

    public final NumberPath<java.math.BigDecimal> montantRec = createNumber("montantRec", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantTitre = createNumber("montantTitre", java.math.BigDecimal.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final StringPath section = createString("section");

    public final com.querydsl.sql.PrimaryKey<QOpeTrancheBudRec> opeTrancheBudRecPk = createPrimaryKey(idOpeTrancheBudRec);

    public QOpeTrancheBudRec(String variable) {
        super(QOpeTrancheBudRec.class, forVariable(variable), "GFC", "OPE_TRANCHE_BUD_REC");
        addMetadata();
    }

    public QOpeTrancheBudRec(String variable, String schema, String table) {
        super(QOpeTrancheBudRec.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeTrancheBudRec(Path<? extends QOpeTrancheBudRec> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_TRANCHE_BUD_REC");
        addMetadata();
    }

    public QOpeTrancheBudRec(PathMetadata metadata) {
        super(QOpeTrancheBudRec.class, metadata, "GFC", "OPE_TRANCHE_BUD_REC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(8).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(12).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(6).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmOrigineRecette, ColumnMetadata.named("ID_ADM_ORIGINE_RECETTE").withIndex(7).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeTrancheBud, ColumnMetadata.named("ID_OPE_TRANCHE_BUD").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeTrancheBudRec, ColumnMetadata.named("ID_OPE_TRANCHE_BUD_REC").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(montantRec, ColumnMetadata.named("MONTANT_REC").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(montantTitre, ColumnMetadata.named("MONTANT_TITRE").withIndex(13).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(9).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(11).ofType(Types.DECIMAL).withSize(38));
        addMetadata(section, ColumnMetadata.named("SECTION").withIndex(5).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepSf is a Querydsl query type for QDepSf
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepSf extends com.querydsl.sql.RelationalPathBase<QDepSf> {

    private static final long serialVersionUID = -1576797896;

    public static final QDepSf depSf = new QDepSf("DEP_SF");

    public final StringPath commentaire = createString("commentaire");

    public final StringPath dateCertification = createString("dateCertification");

    public final StringPath dateConstat = createString("dateConstat");

    public final StringPath dateRefus = createString("dateRefus");

    public final StringPath dateSf = createString("dateSf");

    public final StringPath dCreation = createString("dCreation");

    public final StringPath dModification = createString("dModification");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idDepEj = createNumber("idDepEj", Long.class);

    public final NumberPath<Long> idDepSf = createNumber("idDepSf", Long.class);

    public final StringPath motifRefus = createString("motifRefus");

    public final StringPath numSf = createString("numSf");

    public final NumberPath<Long> persIdCertification = createNumber("persIdCertification", Long.class);

    public final NumberPath<Long> persIdConstat = createNumber("persIdConstat", Long.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final NumberPath<Long> persIdRefus = createNumber("persIdRefus", Long.class);

    public final NumberPath<Long> persIdSf = createNumber("persIdSf", Long.class);

    public final StringPath referenceSf = createString("referenceSf");

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final NumberPath<Long> tyetId = createNumber("tyetId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDepSf> idDepSfPk = createPrimaryKey(idDepSf);

    public QDepSf(String variable) {
        super(QDepSf.class, forVariable(variable), "GFC", "DEP_SF");
        addMetadata();
    }

    public QDepSf(String variable, String schema, String table) {
        super(QDepSf.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepSf(Path<? extends QDepSf> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_SF");
        addMetadata();
    }

    public QDepSf(PathMetadata metadata) {
        super(QDepSf.class, metadata, "GFC", "DEP_SF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(6).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dateCertification, ColumnMetadata.named("DATE_CERTIFICATION").withIndex(11).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dateConstat, ColumnMetadata.named("DATE_CONSTAT").withIndex(9).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dateRefus, ColumnMetadata.named("DATE_REFUS").withIndex(14).ofType(Types.VARCHAR).withSize(30));
        addMetadata(dateSf, ColumnMetadata.named("DATE_SF").withIndex(7).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(16).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(18).ofType(Types.VARCHAR).withSize(30));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idDepEj, ColumnMetadata.named("ID_DEP_EJ").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idDepSf, ColumnMetadata.named("ID_DEP_SF").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(motifRefus, ColumnMetadata.named("MOTIF_REFUS").withIndex(13).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(numSf, ColumnMetadata.named("NUM_SF").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(persIdCertification, ColumnMetadata.named("PERS_ID_CERTIFICATION").withIndex(12).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persIdConstat, ColumnMetadata.named("PERS_ID_CONSTAT").withIndex(10).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(17).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(19).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persIdRefus, ColumnMetadata.named("PERS_ID_REFUS").withIndex(15).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persIdSf, ColumnMetadata.named("PERS_ID_SF").withIndex(8).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(referenceSf, ColumnMetadata.named("REFERENCE_SF").withIndex(5).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(21).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(tyetId, ColumnMetadata.named("TYET_ID").withIndex(20).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


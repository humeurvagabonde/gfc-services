package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecouvrement is a Querydsl query type for QRecouvrement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecouvrement extends com.querydsl.sql.RelationalPathBase<QRecouvrement> {

    private static final long serialVersionUID = -560469093;

    public static final QRecouvrement recouvrement = new QRecouvrement("RECOUVREMENT");

    public final NumberPath<Long> comOrdre = createNumber("comOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final DateTimePath<java.sql.Timestamp> recoDateCreation = createDateTime("recoDateCreation", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> recoMontant = createNumber("recoMontant", java.math.BigDecimal.class);

    public final NumberPath<Long> recoNb = createNumber("recoNb", Long.class);

    public final NumberPath<Long> recoNumero = createNumber("recoNumero", Long.class);

    public final NumberPath<Long> recoOrdre = createNumber("recoOrdre", Long.class);

    public final NumberPath<Long> trecOrdre = createNumber("trecOrdre", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QRecouvrement> recouvrementPk = createPrimaryKey(recoOrdre);

    public QRecouvrement(String variable) {
        super(QRecouvrement.class, forVariable(variable), "GFC", "RECOUVREMENT");
        addMetadata();
    }

    public QRecouvrement(String variable, String schema, String table) {
        super(QRecouvrement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecouvrement(Path<? extends QRecouvrement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "RECOUVREMENT");
        addMetadata();
    }

    public QRecouvrement(PathMetadata metadata) {
        super(QRecouvrement.class, metadata, "GFC", "RECOUVREMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comOrdre, ColumnMetadata.named("COM_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(recoDateCreation, ColumnMetadata.named("RECO_DATE_CREATION").withIndex(6).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(recoMontant, ColumnMetadata.named("RECO_MONTANT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(recoNb, ColumnMetadata.named("RECO_NB").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recoNumero, ColumnMetadata.named("RECO_NUMERO").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(recoOrdre, ColumnMetadata.named("RECO_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(trecOrdre, ColumnMetadata.named("TREC_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


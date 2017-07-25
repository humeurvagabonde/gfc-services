package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVMandatRejete is a Querydsl query type for QVMandatRejete
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVMandatRejete extends com.querydsl.sql.RelationalPathBase<QVMandatRejete> {

    private static final long serialVersionUID = -1029371896;

    public static final QVMandatRejete vMandatRejete = new QVMandatRejete("V_MANDAT_REJETE");

    public final NumberPath<Long> borNumOrigine = createNumber("borNumOrigine", Long.class);

    public final NumberPath<Long> brjNum = createNumber("brjNum", Long.class);

    public final DateTimePath<java.sql.Timestamp> dateMandat = createDateTime("dateMandat", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateRejet = createDateTime("dateRejet", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath fouCode = createString("fouCode");

    public final StringPath fournisseur = createString("fournisseur");

    public final StringPath gesCode = createString("gesCode");

    public final NumberPath<java.math.BigDecimal> manHt = createNumber("manHt", java.math.BigDecimal.class);

    public final NumberPath<Long> manId = createNumber("manId", Long.class);

    public final StringPath manMotifRejet = createString("manMotifRejet");

    public final NumberPath<Long> manNumero = createNumber("manNumero", Long.class);

    public final StringPath pcoNum = createString("pcoNum");

    public final StringPath tboLibelleOrigine = createString("tboLibelleOrigine");

    public final StringPath tboLibelleRejet = createString("tboLibelleRejet");

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public QVMandatRejete(String variable) {
        super(QVMandatRejete.class, forVariable(variable), "GFC", "V_MANDAT_REJETE");
        addMetadata();
    }

    public QVMandatRejete(String variable, String schema, String table) {
        super(QVMandatRejete.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVMandatRejete(Path<? extends QVMandatRejete> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_MANDAT_REJETE");
        addMetadata();
    }

    public QVMandatRejete(PathMetadata metadata) {
        super(QVMandatRejete.class, metadata, "GFC", "V_MANDAT_REJETE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(borNumOrigine, ColumnMetadata.named("BOR_NUM_ORIGINE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(brjNum, ColumnMetadata.named("BRJ_NUM").withIndex(11).ofType(Types.DECIMAL).withSize(0));
        addMetadata(dateMandat, ColumnMetadata.named("DATE_MANDAT").withIndex(5).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateRejet, ColumnMetadata.named("DATE_REJET").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(fouCode, ColumnMetadata.named("FOU_CODE").withIndex(9).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(fournisseur, ColumnMetadata.named("FOURNISSEUR").withIndex(10).ofType(Types.VARCHAR).withSize(241));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(manHt, ColumnMetadata.named("MAN_HT").withIndex(15).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(manId, ColumnMetadata.named("MAN_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(manMotifRejet, ColumnMetadata.named("MAN_MOTIF_REJET").withIndex(14).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(manNumero, ColumnMetadata.named("MAN_NUMERO").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(8).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(tboLibelleOrigine, ColumnMetadata.named("TBO_LIBELLE_ORIGINE").withIndex(7).ofType(Types.VARCHAR).withSize(60).notNull());
        addMetadata(tboLibelleRejet, ColumnMetadata.named("TBO_LIBELLE_REJET").withIndex(12).ofType(Types.VARCHAR).withSize(60).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(16).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


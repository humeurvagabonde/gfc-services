package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVMandatReimp0 is a Querydsl query type for QVMandatReimp0
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVMandatReimp0 extends com.querydsl.sql.RelationalPathBase<QVMandatReimp0> {

    private static final long serialVersionUID = -1029394176;

    public static final QVMandatReimp0 vMandatReimp0 = new QVMandatReimp0("V_MANDAT_REIMP_0");

    public final NumberPath<Long> borId = createNumber("borId", Long.class);

    public final NumberPath<java.math.BigDecimal> ecdMontant = createNumber("ecdMontant", java.math.BigDecimal.class);

    public final DateTimePath<java.sql.Timestamp> ecrDate = createDateTime("ecrDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> ecrDateSaisie = createDateTime("ecrDateSaisie", java.sql.Timestamp.class);

    public final NumberPath<Long> ecrOrdre = createNumber("ecrOrdre", Long.class);

    public final StringPath ecrSacd = createString("ecrSacd");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath manEtat = createString("manEtat");

    public final NumberPath<Long> manId = createNumber("manId", Long.class);

    public final StringPath manLib = createString("manLib");

    public final NumberPath<java.math.BigDecimal> manMont = createNumber("manMont", java.math.BigDecimal.class);

    public final NumberPath<Long> manNum = createNumber("manNum", Long.class);

    public final NumberPath<Long> manTva = createNumber("manTva", Long.class);

    public final StringPath mdeOrigine = createString("mdeOrigine");

    public final StringPath pcoNum = createString("pcoNum");

    public final NumberPath<Long> tboOrdre = createNumber("tboOrdre", Long.class);

    public QVMandatReimp0(String variable) {
        super(QVMandatReimp0.class, forVariable(variable), "GFC", "V_MANDAT_REIMP_0");
        addMetadata();
    }

    public QVMandatReimp0(String variable, String schema, String table) {
        super(QVMandatReimp0.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVMandatReimp0(Path<? extends QVMandatReimp0> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_MANDAT_REIMP_0");
        addMetadata();
    }

    public QVMandatReimp0(PathMetadata metadata) {
        super(QVMandatReimp0.class, metadata, "GFC", "V_MANDAT_REIMP_0");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(borId, ColumnMetadata.named("BOR_ID").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ecdMontant, ColumnMetadata.named("ECD_MONTANT").withIndex(18).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(ecrDate, ColumnMetadata.named("ECR_DATE").withIndex(3).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(ecrDateSaisie, ColumnMetadata.named("ECR_DATE_SAISIE").withIndex(2).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(ecrOrdre, ColumnMetadata.named("ECR_ORDRE").withIndex(15).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ecrSacd, ColumnMetadata.named("ECR_SACD").withIndex(16).ofType(Types.VARCHAR).withSize(1));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(14).ofType(Types.DECIMAL).withSize(0));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(manEtat, ColumnMetadata.named("MAN_ETAT").withIndex(13).ofType(Types.VARCHAR).withSize(50));
        addMetadata(manId, ColumnMetadata.named("MAN_ID").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(manLib, ColumnMetadata.named("MAN_LIB").withIndex(10).ofType(Types.VARCHAR).withSize(500));
        addMetadata(manMont, ColumnMetadata.named("MAN_MONT").withIndex(11).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(manNum, ColumnMetadata.named("MAN_NUM").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(manTva, ColumnMetadata.named("MAN_TVA").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(mdeOrigine, ColumnMetadata.named("MDE_ORIGINE").withIndex(17).ofType(Types.VARCHAR).withSize(30));
        addMetadata(pcoNum, ColumnMetadata.named("PCO_NUM").withIndex(5).ofType(Types.VARCHAR).withSize(20));
        addMetadata(tboOrdre, ColumnMetadata.named("TBO_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(0));
    }

}


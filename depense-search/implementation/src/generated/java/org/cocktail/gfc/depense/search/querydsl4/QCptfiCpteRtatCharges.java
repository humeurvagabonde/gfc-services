package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptfiCpteRtatCharges is a Querydsl query type for QCptfiCpteRtatCharges
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptfiCpteRtatCharges extends com.querydsl.sql.RelationalPathBase<QCptfiCpteRtatCharges> {

    private static final long serialVersionUID = 910906060;

    public static final QCptfiCpteRtatCharges cptfiCpteRtatCharges = new QCptfiCpteRtatCharges("CPTFI_CPTE_RTAT_CHARGES");

    public final StringPath cptrStrId = createString("cptrStrId");

    public final NumberPath<Long> crcOrdre = createNumber("crcOrdre", Long.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final StringPath groupe1 = createString("groupe1");

    public final StringPath groupe2 = createString("groupe2");

    public final NumberPath<Long> idCptCompteResultatType = createNumber("idCptCompteResultatType", Long.class);

    public final StringPath libelle = createString("libelle");

    public final NumberPath<java.math.BigDecimal> montant = createNumber("montant", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> montantAnt = createNumber("montantAnt", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QCptfiCpteRtatCharges> cptfiCpteRtatChargesPk = createPrimaryKey(crcOrdre);

    public QCptfiCpteRtatCharges(String variable) {
        super(QCptfiCpteRtatCharges.class, forVariable(variable), "GFC", "CPTFI_CPTE_RTAT_CHARGES");
        addMetadata();
    }

    public QCptfiCpteRtatCharges(String variable, String schema, String table) {
        super(QCptfiCpteRtatCharges.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptfiCpteRtatCharges(Path<? extends QCptfiCpteRtatCharges> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTFI_CPTE_RTAT_CHARGES");
        addMetadata();
    }

    public QCptfiCpteRtatCharges(PathMetadata metadata) {
        super(QCptfiCpteRtatCharges.class, metadata, "GFC", "CPTFI_CPTE_RTAT_CHARGES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cptrStrId, ColumnMetadata.named("CPTR_STR_ID").withIndex(10).ofType(Types.VARCHAR).withSize(1000).notNull());
        addMetadata(crcOrdre, ColumnMetadata.named("CRC_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(8).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(groupe1, ColumnMetadata.named("GROUPE1").withIndex(3).ofType(Types.VARCHAR).withSize(50));
        addMetadata(groupe2, ColumnMetadata.named("GROUPE2").withIndex(4).ofType(Types.VARCHAR).withSize(50));
        addMetadata(idCptCompteResultatType, ColumnMetadata.named("ID_CPT_COMPTE_RESULTAT_TYPE").withIndex(9).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(100));
        addMetadata(montant, ColumnMetadata.named("MONTANT").withIndex(6).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(montantAnt, ColumnMetadata.named("MONTANT_ANT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


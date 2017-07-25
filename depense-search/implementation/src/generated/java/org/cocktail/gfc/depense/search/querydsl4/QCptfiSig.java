package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCptfiSig is a Querydsl query type for QCptfiSig
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCptfiSig extends com.querydsl.sql.RelationalPathBase<QCptfiSig> {

    private static final long serialVersionUID = -766771823;

    public static final QCptfiSig cptfiSig = new QCptfiSig("CPTFI_SIG");

    public final StringPath commentaire = createString("commentaire");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath formule = createString("formule");

    public final StringPath gesCode = createString("gesCode");

    public final StringPath groupe1 = createString("groupe1");

    public final StringPath groupe2 = createString("groupe2");

    public final StringPath groupeAnt = createString("groupeAnt");

    public final NumberPath<Long> sigId = createNumber("sigId", Long.class);

    public final StringPath sigLibelle = createString("sigLibelle");

    public final NumberPath<java.math.BigDecimal> sigMontant = createNumber("sigMontant", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> sigMontantAnt = createNumber("sigMontantAnt", java.math.BigDecimal.class);

    public final com.querydsl.sql.PrimaryKey<QCptfiSig> cptfiSigPk = createPrimaryKey(sigId);

    public QCptfiSig(String variable) {
        super(QCptfiSig.class, forVariable(variable), "GFC", "CPTFI_SIG");
        addMetadata();
    }

    public QCptfiSig(String variable, String schema, String table) {
        super(QCptfiSig.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCptfiSig(Path<? extends QCptfiSig> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CPTFI_SIG");
        addMetadata();
    }

    public QCptfiSig(PathMetadata metadata) {
        super(QCptfiSig.class, metadata, "GFC", "CPTFI_SIG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(9).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(formule, ColumnMetadata.named("FORMULE").withIndex(8).ofType(Types.VARCHAR).withSize(1000));
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(groupe1, ColumnMetadata.named("GROUPE1").withIndex(4).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(groupe2, ColumnMetadata.named("GROUPE2").withIndex(5).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(groupeAnt, ColumnMetadata.named("GROUPE_ANT").withIndex(11).ofType(Types.VARCHAR).withSize(50));
        addMetadata(sigId, ColumnMetadata.named("SIG_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(sigLibelle, ColumnMetadata.named("SIG_LIBELLE").withIndex(6).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(sigMontant, ColumnMetadata.named("SIG_MONTANT").withIndex(7).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(sigMontantAnt, ColumnMetadata.named("SIG_MONTANT_ANT").withIndex(10).ofType(Types.DECIMAL).withSize(12).withDigits(2));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeOperationPartenaire is a Querydsl query type for QOpeOperationPartenaire
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeOperationPartenaire extends com.querydsl.sql.RelationalPathBase<QOpeOperationPartenaire> {

    private static final long serialVersionUID = 1062336004;

    public static final QOpeOperationPartenaire opeOperationPartenaire = new QOpeOperationPartenaire("OPE_OPERATION_PARTENAIRE");

    public final DateTimePath<java.sql.Timestamp> cpDateSignature = createDateTime("cpDateSignature", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigDecimal> cpMontant = createNumber("cpMontant", java.math.BigDecimal.class);

    public final StringPath cpPrincipal = createString("cpPrincipal");

    public final StringPath cpRefExterneParten = createString("cpRefExterneParten");

    public final StringPath cStructure = createString("cStructure");

    public final NumberPath<Long> idOpeOperation = createNumber("idOpeOperation", Long.class);

    public final NumberPath<Long> idOpeOperationPartenaire = createNumber("idOpeOperationPartenaire", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> typePartOrdre = createNumber("typePartOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QOpeOperationPartenaire> opeOperationPartenairePk = createPrimaryKey(idOpeOperationPartenaire);

    public QOpeOperationPartenaire(String variable) {
        super(QOpeOperationPartenaire.class, forVariable(variable), "GFC", "OPE_OPERATION_PARTENAIRE");
        addMetadata();
    }

    public QOpeOperationPartenaire(String variable, String schema, String table) {
        super(QOpeOperationPartenaire.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeOperationPartenaire(Path<? extends QOpeOperationPartenaire> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_OPERATION_PARTENAIRE");
        addMetadata();
    }

    public QOpeOperationPartenaire(PathMetadata metadata) {
        super(QOpeOperationPartenaire.class, metadata, "GFC", "OPE_OPERATION_PARTENAIRE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cpDateSignature, ColumnMetadata.named("CP_DATE_SIGNATURE").withIndex(8).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(cpMontant, ColumnMetadata.named("CP_MONTANT").withIndex(5).ofType(Types.DECIMAL).withSize(20).withDigits(2));
        addMetadata(cpPrincipal, ColumnMetadata.named("CP_PRINCIPAL").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(cpRefExterneParten, ColumnMetadata.named("CP_REF_EXTERNE_PARTEN").withIndex(9).ofType(Types.VARCHAR).withSize(100));
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(idOpeOperation, ColumnMetadata.named("ID_OPE_OPERATION").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperationPartenaire, ColumnMetadata.named("ID_OPE_OPERATION_PARTENAIRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typePartOrdre, ColumnMetadata.named("TYPE_PART_ORDRE").withIndex(7).ofType(Types.DECIMAL).withSize(38));
    }

}


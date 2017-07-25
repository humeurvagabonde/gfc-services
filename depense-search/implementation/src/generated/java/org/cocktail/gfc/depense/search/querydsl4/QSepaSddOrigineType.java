package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSepaSddOrigineType is a Querydsl query type for QSepaSddOrigineType
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSepaSddOrigineType extends com.querydsl.sql.RelationalPathBase<QSepaSddOrigineType> {

    private static final long serialVersionUID = -1091385453;

    public static final QSepaSddOrigineType sepaSddOrigineType = new QSepaSddOrigineType("SEPA_SDD_ORIGINE_TYPE");

    public final StringPath genEcritures = createString("genEcritures");

    public final NumberPath<Long> idSepaSddOrigineType = createNumber("idSepaSddOrigineType", Long.class);

    public final StringPath typeClass = createString("typeClass");

    public final StringPath typeCode = createString("typeCode");

    public final StringPath typeCommentaire = createString("typeCommentaire");

    public final StringPath typeNom = createString("typeNom");

    public final NumberPath<Integer> typeOrdre = createNumber("typeOrdre", Integer.class);

    public final StringPath typeTable = createString("typeTable");

    public final StringPath typeTableCle = createString("typeTableCle");

    public final StringPath valide = createString("valide");

    public final com.querydsl.sql.PrimaryKey<QSepaSddOrigineType> sepaSddOrigineTypePk = createPrimaryKey(idSepaSddOrigineType);

    public QSepaSddOrigineType(String variable) {
        super(QSepaSddOrigineType.class, forVariable(variable), "GFC", "SEPA_SDD_ORIGINE_TYPE");
        addMetadata();
    }

    public QSepaSddOrigineType(String variable, String schema, String table) {
        super(QSepaSddOrigineType.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSepaSddOrigineType(Path<? extends QSepaSddOrigineType> path) {
        super(path.getType(), path.getMetadata(), "GFC", "SEPA_SDD_ORIGINE_TYPE");
        addMetadata();
    }

    public QSepaSddOrigineType(PathMetadata metadata) {
        super(QSepaSddOrigineType.class, metadata, "GFC", "SEPA_SDD_ORIGINE_TYPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(genEcritures, ColumnMetadata.named("GEN_ECRITURES").withIndex(10).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(idSepaSddOrigineType, ColumnMetadata.named("ID_SEPA_SDD_ORIGINE_TYPE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typeClass, ColumnMetadata.named("TYPE_CLASS").withIndex(5).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(typeCode, ColumnMetadata.named("TYPE_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(typeCommentaire, ColumnMetadata.named("TYPE_COMMENTAIRE").withIndex(8).ofType(Types.VARCHAR).withSize(500).notNull());
        addMetadata(typeNom, ColumnMetadata.named("TYPE_NOM").withIndex(2).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(typeOrdre, ColumnMetadata.named("TYPE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(2).notNull());
        addMetadata(typeTable, ColumnMetadata.named("TYPE_TABLE").withIndex(6).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(typeTableCle, ColumnMetadata.named("TYPE_TABLE_CLE").withIndex(7).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(valide, ColumnMetadata.named("VALIDE").withIndex(9).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


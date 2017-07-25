package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QOpeOperationPartContact is a Querydsl query type for QOpeOperationPartContact
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOpeOperationPartContact extends com.querydsl.sql.RelationalPathBase<QOpeOperationPartContact> {

    private static final long serialVersionUID = -1496729984;

    public static final QOpeOperationPartContact opeOperationPartContact = new QOpeOperationPartContact("OPE_OPERATION_PART_CONTACT");

    public final StringPath cStructure = createString("cStructure");

    public final NumberPath<Long> idOpeOperationPartContact = createNumber("idOpeOperationPartContact", Long.class);

    public final NumberPath<Long> idOpeOperationPartenaire = createNumber("idOpeOperationPartenaire", Long.class);

    public final NumberPath<Long> noIndividu = createNumber("noIndividu", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> persIdContact = createNumber("persIdContact", Long.class);

    public final NumberPath<Long> tcOrdre = createNumber("tcOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QOpeOperationPartContact> opeOperationPartContactPk = createPrimaryKey(idOpeOperationPartContact);

    public QOpeOperationPartContact(String variable) {
        super(QOpeOperationPartContact.class, forVariable(variable), "GFC", "OPE_OPERATION_PART_CONTACT");
        addMetadata();
    }

    public QOpeOperationPartContact(String variable, String schema, String table) {
        super(QOpeOperationPartContact.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOpeOperationPartContact(Path<? extends QOpeOperationPartContact> path) {
        super(path.getType(), path.getMetadata(), "GFC", "OPE_OPERATION_PART_CONTACT");
        addMetadata();
    }

    public QOpeOperationPartContact(PathMetadata metadata) {
        super(QOpeOperationPartContact.class, metadata, "GFC", "OPE_OPERATION_PART_CONTACT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(idOpeOperationPartContact, ColumnMetadata.named("ID_OPE_OPERATION_PART_CONTACT").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOpeOperationPartenaire, ColumnMetadata.named("ID_OPE_OPERATION_PARTENAIRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdContact, ColumnMetadata.named("PERS_ID_CONTACT").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tcOrdre, ColumnMetadata.named("TC_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(38));
    }

}


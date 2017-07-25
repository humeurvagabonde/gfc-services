package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvenantPartContact is a Querydsl query type for QAvenantPartContact
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvenantPartContact extends com.querydsl.sql.RelationalPathBase<QAvenantPartContact> {

    private static final long serialVersionUID = 1310886062;

    public static final QAvenantPartContact avenantPartContact = new QAvenantPartContact("AVENANT_PART_CONTACT");

    public final NumberPath<Long> apcOrdre = createNumber("apcOrdre", Long.class);

    public final NumberPath<Long> avtOrdre = createNumber("avtOrdre", Long.class);

    public final StringPath cStructure = createString("cStructure");

    public final NumberPath<Long> noIndividu = createNumber("noIndividu", Long.class);

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final NumberPath<Long> persIdContact = createNumber("persIdContact", Long.class);

    public final NumberPath<Long> tcOrdre = createNumber("tcOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAvenantPartContact> avenantPartContactPk = createPrimaryKey(apcOrdre);

    public QAvenantPartContact(String variable) {
        super(QAvenantPartContact.class, forVariable(variable), "GFC", "AVENANT_PART_CONTACT");
        addMetadata();
    }

    public QAvenantPartContact(String variable, String schema, String table) {
        super(QAvenantPartContact.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvenantPartContact(Path<? extends QAvenantPartContact> path) {
        super(path.getType(), path.getMetadata(), "GFC", "AVENANT_PART_CONTACT");
        addMetadata();
    }

    public QAvenantPartContact(PathMetadata metadata) {
        super(QAvenantPartContact.class, metadata, "GFC", "AVENANT_PART_CONTACT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(apcOrdre, ColumnMetadata.named("APC_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(avtOrdre, ColumnMetadata.named("AVT_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(5).ofType(Types.DECIMAL).withSize(38));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdContact, ColumnMetadata.named("PERS_ID_CONTACT").withIndex(7).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tcOrdre, ColumnMetadata.named("TC_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(38));
    }

}


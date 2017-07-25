package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeAchat is a Querydsl query type for QTypeAchat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeAchat extends com.querydsl.sql.RelationalPathBase<QTypeAchat> {

    private static final long serialVersionUID = 523204501;

    public static final QTypeAchat typeAchat = new QTypeAchat("TYPE_ACHAT");

    public final NumberPath<Long> typaId = createNumber("typaId", Long.class);

    public final StringPath typaLibelle = createString("typaLibelle");

    public final com.querydsl.sql.PrimaryKey<QTypeAchat> typeAchatPk = createPrimaryKey(typaId);

    public QTypeAchat(String variable) {
        super(QTypeAchat.class, forVariable(variable), "GFC", "TYPE_ACHAT");
        addMetadata();
    }

    public QTypeAchat(String variable, String schema, String table) {
        super(QTypeAchat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeAchat(Path<? extends QTypeAchat> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_ACHAT");
        addMetadata();
    }

    public QTypeAchat(PathMetadata metadata) {
        super(QTypeAchat.class, metadata, "GFC", "TYPE_ACHAT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(typaId, ColumnMetadata.named("TYPA_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(typaLibelle, ColumnMetadata.named("TYPA_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


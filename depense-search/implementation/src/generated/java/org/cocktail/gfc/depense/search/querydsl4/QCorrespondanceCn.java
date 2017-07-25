package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCorrespondanceCn is a Querydsl query type for QCorrespondanceCn
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCorrespondanceCn extends com.querydsl.sql.RelationalPathBase<QCorrespondanceCn> {

    private static final long serialVersionUID = -893935885;

    public static final QCorrespondanceCn correspondanceCn = new QCorrespondanceCn("CORRESPONDANCE_CN");

    public final StringPath ancienCn = createString("ancienCn");

    public final StringPath nouveauCn = createString("nouveauCn");

    public final com.querydsl.sql.PrimaryKey<QCorrespondanceCn> correspondanceCnPk = createPrimaryKey(ancienCn, nouveauCn);

    public QCorrespondanceCn(String variable) {
        super(QCorrespondanceCn.class, forVariable(variable), "GFC", "CORRESPONDANCE_CN");
        addMetadata();
    }

    public QCorrespondanceCn(String variable, String schema, String table) {
        super(QCorrespondanceCn.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCorrespondanceCn(Path<? extends QCorrespondanceCn> path) {
        super(path.getType(), path.getMetadata(), "GFC", "CORRESPONDANCE_CN");
        addMetadata();
    }

    public QCorrespondanceCn(PathMetadata metadata) {
        super(QCorrespondanceCn.class, metadata, "GFC", "CORRESPONDANCE_CN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ancienCn, ColumnMetadata.named("ANCIEN_CN").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(nouveauCn, ColumnMetadata.named("NOUVEAU_CN").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
    }

}


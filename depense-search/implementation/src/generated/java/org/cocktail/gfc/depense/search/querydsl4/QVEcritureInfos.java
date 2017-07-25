package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVEcritureInfos is a Querydsl query type for QVEcritureInfos
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVEcritureInfos extends com.querydsl.sql.RelationalPathBase<QVEcritureInfos> {

    private static final long serialVersionUID = 1245232944;

    public static final QVEcritureInfos vEcritureInfos = new QVEcritureInfos("V_ECRITURE_INFOS");

    public final NumberPath<Long> ecdOrdre = createNumber("ecdOrdre", Long.class);

    public final StringPath ecrSacd = createString("ecrSacd");

    public QVEcritureInfos(String variable) {
        super(QVEcritureInfos.class, forVariable(variable), "GFC", "V_ECRITURE_INFOS");
        addMetadata();
    }

    public QVEcritureInfos(String variable, String schema, String table) {
        super(QVEcritureInfos.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVEcritureInfos(Path<? extends QVEcritureInfos> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ECRITURE_INFOS");
        addMetadata();
    }

    public QVEcritureInfos(PathMetadata metadata) {
        super(QVEcritureInfos.class, metadata, "GFC", "V_ECRITURE_INFOS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ecdOrdre, ColumnMetadata.named("ECD_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(ecrSacd, ColumnMetadata.named("ECR_SACD").withIndex(2).ofType(Types.VARCHAR).withSize(1));
    }

}


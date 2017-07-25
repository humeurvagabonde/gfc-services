package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEpnCodBudBaSacd is a Querydsl query type for QEpnCodBudBaSacd
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEpnCodBudBaSacd extends com.querydsl.sql.RelationalPathBase<QEpnCodBudBaSacd> {

    private static final long serialVersionUID = 1891645184;

    public static final QEpnCodBudBaSacd epnCodBudBaSacd = new QEpnCodBudBaSacd("EPN_COD_BUD_BA_SACD");

    public final StringPath codBud = createString("codBud");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath gesCode = createString("gesCode");

    public final com.querydsl.sql.PrimaryKey<QEpnCodBudBaSacd> epnCodBudCGenPk = createPrimaryKey(codBud, exeOrdre);

    public QEpnCodBudBaSacd(String variable) {
        super(QEpnCodBudBaSacd.class, forVariable(variable), "GFC", "EPN_COD_BUD_BA_SACD");
        addMetadata();
    }

    public QEpnCodBudBaSacd(String variable, String schema, String table) {
        super(QEpnCodBudBaSacd.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEpnCodBudBaSacd(Path<? extends QEpnCodBudBaSacd> path) {
        super(path.getType(), path.getMetadata(), "GFC", "EPN_COD_BUD_BA_SACD");
        addMetadata();
    }

    public QEpnCodBudBaSacd(PathMetadata metadata) {
        super(QEpnCodBudBaSacd.class, metadata, "GFC", "EPN_COD_BUD_BA_SACD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codBud, ColumnMetadata.named("COD_BUD").withIndex(1).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(gesCode, ColumnMetadata.named("GES_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
    }

}


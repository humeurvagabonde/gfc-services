package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCodeMarche2013 is a Querydsl query type for QVCodeMarche2013
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCodeMarche2013 extends com.querydsl.sql.RelationalPathBase<QVCodeMarche2013> {

    private static final long serialVersionUID = -1510507205;

    public static final QVCodeMarche2013 vCodeMarche2013 = new QVCodeMarche2013("V_CODE_MARCHE_2013");

    public final StringPath cmCode = createString("cmCode");

    public final StringPath cmLib = createString("cmLib");

    public final NumberPath<Long> cmNiveau = createNumber("cmNiveau", Long.class);

    public final StringPath tcnLibelle = createString("tcnLibelle");

    public QVCodeMarche2013(String variable) {
        super(QVCodeMarche2013.class, forVariable(variable), "GFC", "V_CODE_MARCHE_2013");
        addMetadata();
    }

    public QVCodeMarche2013(String variable, String schema, String table) {
        super(QVCodeMarche2013.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCodeMarche2013(Path<? extends QVCodeMarche2013> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CODE_MARCHE_2013");
        addMetadata();
    }

    public QVCodeMarche2013(PathMetadata metadata) {
        super(QVCodeMarche2013.class, metadata, "GFC", "V_CODE_MARCHE_2013");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cmCode, ColumnMetadata.named("CM_CODE").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(cmLib, ColumnMetadata.named("CM_LIB").withIndex(3).ofType(Types.VARCHAR).withSize(150).notNull());
        addMetadata(cmNiveau, ColumnMetadata.named("CM_NIVEAU").withIndex(2).ofType(Types.DECIMAL).withSize(22));
        addMetadata(tcnLibelle, ColumnMetadata.named("TCN_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(50));
    }

}


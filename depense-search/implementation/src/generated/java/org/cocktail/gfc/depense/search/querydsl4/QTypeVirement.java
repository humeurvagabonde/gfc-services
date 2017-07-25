package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeVirement is a Querydsl query type for QTypeVirement
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeVirement extends com.querydsl.sql.RelationalPathBase<QTypeVirement> {

    private static final long serialVersionUID = -386784088;

    public static final QTypeVirement typeVirement = new QTypeVirement("TYPE_VIREMENT");

    public final StringPath modDom = createString("modDom");

    public final StringPath tviFormat = createString("tviFormat");

    public final StringPath tviLibelle = createString("tviLibelle");

    public final NumberPath<Long> tviOrdre = createNumber("tviOrdre", Long.class);

    public final StringPath tviValidite = createString("tviValidite");

    public final com.querydsl.sql.PrimaryKey<QTypeVirement> typeVirementPk = createPrimaryKey(tviOrdre);

    public QTypeVirement(String variable) {
        super(QTypeVirement.class, forVariable(variable), "GFC", "TYPE_VIREMENT");
        addMetadata();
    }

    public QTypeVirement(String variable, String schema, String table) {
        super(QTypeVirement.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeVirement(Path<? extends QTypeVirement> path) {
        super(path.getType(), path.getMetadata(), "GFC", "TYPE_VIREMENT");
        addMetadata();
    }

    public QTypeVirement(PathMetadata metadata) {
        super(QTypeVirement.class, metadata, "GFC", "TYPE_VIREMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(modDom, ColumnMetadata.named("MOD_DOM").withIndex(4).ofType(Types.VARCHAR).withSize(20));
        addMetadata(tviFormat, ColumnMetadata.named("TVI_FORMAT").withIndex(5).ofType(Types.VARCHAR).withSize(20));
        addMetadata(tviLibelle, ColumnMetadata.named("TVI_LIBELLE").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(tviOrdre, ColumnMetadata.named("TVI_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tviValidite, ColumnMetadata.named("TVI_VALIDITE").withIndex(3).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


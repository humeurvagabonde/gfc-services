package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QImmLigneBien is a Querydsl query type for QImmLigneBien
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QImmLigneBien extends com.querydsl.sql.RelationalPathBase<QImmLigneBien> {

    private static final long serialVersionUID = -2029028462;

    public static final QImmLigneBien immLigneBien = new QImmLigneBien("IMM_LIGNE_BIEN");

    public final StringPath etat = createString("etat");

    public final NumberPath<Long> idBien = createNumber("idBien", Long.class);

    public final NumberPath<Long> idLigneBien = createNumber("idLigneBien", Long.class);

    public final NumberPath<Long> idOrigineBien = createNumber("idOrigineBien", Long.class);

    public final com.querydsl.sql.PrimaryKey<QImmLigneBien> idLigneBienPk = createPrimaryKey(idLigneBien);

    public QImmLigneBien(String variable) {
        super(QImmLigneBien.class, forVariable(variable), "GFC", "IMM_LIGNE_BIEN");
        addMetadata();
    }

    public QImmLigneBien(String variable, String schema, String table) {
        super(QImmLigneBien.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QImmLigneBien(Path<? extends QImmLigneBien> path) {
        super(path.getType(), path.getMetadata(), "GFC", "IMM_LIGNE_BIEN");
        addMetadata();
    }

    public QImmLigneBien(PathMetadata metadata) {
        super(QImmLigneBien.class, metadata, "GFC", "IMM_LIGNE_BIEN");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(etat, ColumnMetadata.named("ETAT").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(idBien, ColumnMetadata.named("ID_BIEN").withIndex(3).ofType(Types.DECIMAL).withSize(38));
        addMetadata(idLigneBien, ColumnMetadata.named("ID_LIGNE_BIEN").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idOrigineBien, ColumnMetadata.named("ID_ORIGINE_BIEN").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


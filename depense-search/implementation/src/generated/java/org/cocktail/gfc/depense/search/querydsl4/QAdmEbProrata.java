package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmEbProrata is a Querydsl query type for QAdmEbProrata
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmEbProrata extends com.querydsl.sql.RelationalPathBase<QAdmEbProrata> {

    private static final long serialVersionUID = 1865905388;

    public static final QAdmEbProrata admEbProrata = new QAdmEbProrata("ADM_EB_PRORATA");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> orpId = createNumber("orpId", Long.class);

    public final NumberPath<Long> orpPriorite = createNumber("orpPriorite", Long.class);

    public final NumberPath<Long> tapId = createNumber("tapId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmEbProrata> ebProrataPk = createPrimaryKey(orpId);

    public QAdmEbProrata(String variable) {
        super(QAdmEbProrata.class, forVariable(variable), "GFC", "ADM_EB_PRORATA");
        addMetadata();
    }

    public QAdmEbProrata(String variable, String schema, String table) {
        super(QAdmEbProrata.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmEbProrata(Path<? extends QAdmEbProrata> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_EB_PRORATA");
        addMetadata();
    }

    public QAdmEbProrata(PathMetadata metadata) {
        super(QAdmEbProrata.class, metadata, "GFC", "ADM_EB_PRORATA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(orpId, ColumnMetadata.named("ORP_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(orpPriorite, ColumnMetadata.named("ORP_PRIORITE").withIndex(5).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(tapId, ColumnMetadata.named("TAP_ID").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


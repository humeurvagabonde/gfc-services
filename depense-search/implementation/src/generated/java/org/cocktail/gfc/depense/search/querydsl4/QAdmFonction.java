package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmFonction is a Querydsl query type for QAdmFonction
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmFonction extends com.querydsl.sql.RelationalPathBase<QAdmFonction> {

    private static final long serialVersionUID = 1023714578;

    public static final QAdmFonction admFonction = new QAdmFonction("ADM_FONCTION");

    public final StringPath fonCategorie = createString("fonCategorie");

    public final StringPath fonDescription = createString("fonDescription");

    public final StringPath fonIdInterne = createString("fonIdInterne");

    public final StringPath fonLibelle = createString("fonLibelle");

    public final NumberPath<Long> fonOrdre = createNumber("fonOrdre", Long.class);

    public final StringPath fonSpecEb = createString("fonSpecEb");

    public final StringPath fonSpecExercice = createString("fonSpecExercice");

    public final StringPath fonSpecGestion = createString("fonSpecGestion");

    public final NumberPath<Long> tyapId = createNumber("tyapId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmFonction> fonctionPk = createPrimaryKey(fonOrdre);

    public QAdmFonction(String variable) {
        super(QAdmFonction.class, forVariable(variable), "GFC", "ADM_FONCTION");
        addMetadata();
    }

    public QAdmFonction(String variable, String schema, String table) {
        super(QAdmFonction.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmFonction(Path<? extends QAdmFonction> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_FONCTION");
        addMetadata();
    }

    public QAdmFonction(PathMetadata metadata) {
        super(QAdmFonction.class, metadata, "GFC", "ADM_FONCTION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fonCategorie, ColumnMetadata.named("FON_CATEGORIE").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(fonDescription, ColumnMetadata.named("FON_DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(500));
        addMetadata(fonIdInterne, ColumnMetadata.named("FON_ID_INTERNE").withIndex(2).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(fonLibelle, ColumnMetadata.named("FON_LIBELLE").withIndex(5).ofType(Types.VARCHAR).withSize(100).notNull());
        addMetadata(fonOrdre, ColumnMetadata.named("FON_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(12).notNull());
        addMetadata(fonSpecEb, ColumnMetadata.named("FON_SPEC_EB").withIndex(7).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(fonSpecExercice, ColumnMetadata.named("FON_SPEC_EXERCICE").withIndex(8).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(fonSpecGestion, ColumnMetadata.named("FON_SPEC_GESTION").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(tyapId, ColumnMetadata.named("TYAP_ID").withIndex(9).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


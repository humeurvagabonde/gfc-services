package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudPrevInfoCafTb is a Querydsl query type for QBudPrevInfoCafTb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudPrevInfoCafTb extends com.querydsl.sql.RelationalPathBase<QBudPrevInfoCafTb> {

    private static final long serialVersionUID = 1931976750;

    public static final QBudPrevInfoCafTb budPrevInfoCafTb = new QBudPrevInfoCafTb("BUD_PREV_INFO_CAF_TB");

    public final StringPath commentaire = createString("commentaire");

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModification = createDateTime("dateModification", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDonneesCafTb = createNumber("idAdmDonneesCafTb", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> infoOrdre = createNumber("infoOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> montantCaf = createNumber("montantCaf", java.math.BigDecimal.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBudPrevInfoCafTb> budPrevInfoCafTbPk = createPrimaryKey(infoOrdre);

    public QBudPrevInfoCafTb(String variable) {
        super(QBudPrevInfoCafTb.class, forVariable(variable), "GFC", "BUD_PREV_INFO_CAF_TB");
        addMetadata();
    }

    public QBudPrevInfoCafTb(String variable, String schema, String table) {
        super(QBudPrevInfoCafTb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudPrevInfoCafTb(Path<? extends QBudPrevInfoCafTb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_PREV_INFO_CAF_TB");
        addMetadata();
    }

    public QBudPrevInfoCafTb(PathMetadata metadata) {
        super(QBudPrevInfoCafTb.class, metadata, "GFC", "BUD_PREV_INFO_CAF_TB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(5).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateModification, ColumnMetadata.named("DATE_MODIFICATION").withIndex(11).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDonneesCafTb, ColumnMetadata.named("ID_ADM_DONNEES_CAF_TB").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(9).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(infoOrdre, ColumnMetadata.named("INFO_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(montantCaf, ColumnMetadata.named("MONTANT_CAF").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(6).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(7).ofType(Types.DECIMAL).withSize(0));
    }

}


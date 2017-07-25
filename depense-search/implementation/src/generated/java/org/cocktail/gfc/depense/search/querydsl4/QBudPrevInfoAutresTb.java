package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QBudPrevInfoAutresTb is a Querydsl query type for QBudPrevInfoAutresTb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QBudPrevInfoAutresTb extends com.querydsl.sql.RelationalPathBase<QBudPrevInfoAutresTb> {

    private static final long serialVersionUID = 470892950;

    public static final QBudPrevInfoAutresTb budPrevInfoAutresTb = new QBudPrevInfoAutresTb("BUD_PREV_INFO_AUTRES_TB");

    public final StringPath commentaire = createString("commentaire");

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModification = createDateTime("dateModification", java.sql.Timestamp.class);

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDonneesAutresTb = createNumber("idAdmDonneesAutresTb", Long.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> idBudBudget = createNumber("idBudBudget", Long.class);

    public final NumberPath<Long> infoOrdre = createNumber("infoOrdre", Long.class);

    public final NumberPath<java.math.BigDecimal> montant = createNumber("montant", java.math.BigDecimal.class);

    public final NumberPath<Long> persIdCreation = createNumber("persIdCreation", Long.class);

    public final NumberPath<Long> persIdModification = createNumber("persIdModification", Long.class);

    public final com.querydsl.sql.PrimaryKey<QBudPrevInfoAutresTb> budPrevInfoAutresTbPk = createPrimaryKey(infoOrdre);

    public QBudPrevInfoAutresTb(String variable) {
        super(QBudPrevInfoAutresTb.class, forVariable(variable), "GFC", "BUD_PREV_INFO_AUTRES_TB");
        addMetadata();
    }

    public QBudPrevInfoAutresTb(String variable, String schema, String table) {
        super(QBudPrevInfoAutresTb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QBudPrevInfoAutresTb(Path<? extends QBudPrevInfoAutresTb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "BUD_PREV_INFO_AUTRES_TB");
        addMetadata();
    }

    public QBudPrevInfoAutresTb(PathMetadata metadata) {
        super(QBudPrevInfoAutresTb.class, metadata, "GFC", "BUD_PREV_INFO_AUTRES_TB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commentaire, ColumnMetadata.named("COMMENTAIRE").withIndex(6).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(8).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateModification, ColumnMetadata.named("DATE_MODIFICATION").withIndex(10).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(11).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDonneesAutresTb, ColumnMetadata.named("ID_ADM_DONNEES_AUTRES_TB").withIndex(4).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idBudBudget, ColumnMetadata.named("ID_BUD_BUDGET").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(infoOrdre, ColumnMetadata.named("INFO_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(montant, ColumnMetadata.named("MONTANT").withIndex(5).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(persIdCreation, ColumnMetadata.named("PERS_ID_CREATION").withIndex(7).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(persIdModification, ColumnMetadata.named("PERS_ID_MODIFICATION").withIndex(9).ofType(Types.DECIMAL).withSize(0));
    }

}


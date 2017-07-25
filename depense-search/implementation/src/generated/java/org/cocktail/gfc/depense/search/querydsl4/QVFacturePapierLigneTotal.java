package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVFacturePapierLigneTotal is a Querydsl query type for QVFacturePapierLigneTotal
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVFacturePapierLigneTotal extends com.querydsl.sql.RelationalPathBase<QVFacturePapierLigneTotal> {

    private static final long serialVersionUID = 1921856330;

    public static final QVFacturePapierLigneTotal vFacturePapierLigneTotal = new QVFacturePapierLigneTotal("V_FACTURE_PAPIER_LIGNE_TOTAL");

    public final NumberPath<Long> fapId = createNumber("fapId", Long.class);

    public final NumberPath<Long> prestId = createNumber("prestId", Long.class);

    public final NumberPath<Long> sumFligArtHt = createNumber("sumFligArtHt", Long.class);

    public final NumberPath<Long> sumFligArtTtc = createNumber("sumFligArtTtc", Long.class);

    public final NumberPath<Long> sumFligArtTtcInitial = createNumber("sumFligArtTtcInitial", Long.class);

    public final NumberPath<Long> sumFligTotalHt = createNumber("sumFligTotalHt", Long.class);

    public final NumberPath<Long> sumFligTotalTtc = createNumber("sumFligTotalTtc", Long.class);

    public QVFacturePapierLigneTotal(String variable) {
        super(QVFacturePapierLigneTotal.class, forVariable(variable), "GFC", "V_FACTURE_PAPIER_LIGNE_TOTAL");
        addMetadata();
    }

    public QVFacturePapierLigneTotal(String variable, String schema, String table) {
        super(QVFacturePapierLigneTotal.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVFacturePapierLigneTotal(Path<? extends QVFacturePapierLigneTotal> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_FACTURE_PAPIER_LIGNE_TOTAL");
        addMetadata();
    }

    public QVFacturePapierLigneTotal(PathMetadata metadata) {
        super(QVFacturePapierLigneTotal.class, metadata, "GFC", "V_FACTURE_PAPIER_LIGNE_TOTAL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fapId, ColumnMetadata.named("FAP_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prestId, ColumnMetadata.named("PREST_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(sumFligArtHt, ColumnMetadata.named("SUM_FLIG_ART_HT").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(sumFligArtTtc, ColumnMetadata.named("SUM_FLIG_ART_TTC").withIndex(4).ofType(Types.DECIMAL).withSize(0));
        addMetadata(sumFligArtTtcInitial, ColumnMetadata.named("SUM_FLIG_ART_TTC_INITIAL").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(sumFligTotalHt, ColumnMetadata.named("SUM_FLIG_TOTAL_HT").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(sumFligTotalTtc, ColumnMetadata.named("SUM_FLIG_TOTAL_TTC").withIndex(7).ofType(Types.DECIMAL).withSize(0));
    }

}


package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmImTaux is a Querydsl query type for QAdmImTaux
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmImTaux extends com.querydsl.sql.RelationalPathBase<QAdmImTaux> {

    private static final long serialVersionUID = -863155756;

    public static final QAdmImTaux admImTaux = new QAdmImTaux("ADM_IM_TAUX");

    public final DateTimePath<java.sql.Timestamp> dateCreation = createDateTime("dateCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateModification = createDateTime("dateModification", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> imtaDebut = createDateTime("imtaDebut", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> imtaFin = createDateTime("imtaFin", java.sql.Timestamp.class);

    public final NumberPath<Long> imtaId = createNumber("imtaId", Long.class);

    public final NumberPath<java.math.BigDecimal> imtaPenalite = createNumber("imtaPenalite", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> imtaTaux = createNumber("imtaTaux", java.math.BigDecimal.class);

    public final NumberPath<Long> imttId = createNumber("imttId", Long.class);

    public final NumberPath<Long> utlOrdre = createNumber("utlOrdre", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmImTaux> sysC0021914 = createPrimaryKey(imtaId);

    public QAdmImTaux(String variable) {
        super(QAdmImTaux.class, forVariable(variable), "GFC", "ADM_IM_TAUX");
        addMetadata();
    }

    public QAdmImTaux(String variable, String schema, String table) {
        super(QAdmImTaux.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmImTaux(Path<? extends QAdmImTaux> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_IM_TAUX");
        addMetadata();
    }

    public QAdmImTaux(PathMetadata metadata) {
        super(QAdmImTaux.class, metadata, "GFC", "ADM_IM_TAUX");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dateCreation, ColumnMetadata.named("DATE_CREATION").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dateModification, ColumnMetadata.named("DATE_MODIFICATION").withIndex(8).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(imtaDebut, ColumnMetadata.named("IMTA_DEBUT").withIndex(3).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(imtaFin, ColumnMetadata.named("IMTA_FIN").withIndex(4).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(imtaId, ColumnMetadata.named("IMTA_ID").withIndex(1).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(imtaPenalite, ColumnMetadata.named("IMTA_PENALITE").withIndex(9).ofType(Types.DECIMAL).withSize(12).withDigits(2));
        addMetadata(imtaTaux, ColumnMetadata.named("IMTA_TAUX").withIndex(5).ofType(Types.DECIMAL).withSize(19).withDigits(2));
        addMetadata(imttId, ColumnMetadata.named("IMTT_ID").withIndex(2).ofType(Types.DECIMAL).withSize(10).notNull());
        addMetadata(utlOrdre, ColumnMetadata.named("UTL_ORDRE").withIndex(6).ofType(Types.DECIMAL).withSize(10).notNull());
    }

}


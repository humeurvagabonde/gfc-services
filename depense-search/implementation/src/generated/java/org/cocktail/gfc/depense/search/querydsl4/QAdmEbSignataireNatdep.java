package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmEbSignataireNatdep is a Querydsl query type for QAdmEbSignataireNatdep
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmEbSignataireNatdep extends com.querydsl.sql.RelationalPathBase<QAdmEbSignataireNatdep> {

    private static final long serialVersionUID = 1752683958;

    public static final QAdmEbSignataireNatdep admEbSignataireNatdep = new QAdmEbSignataireNatdep("ADM_EB_SIGNATAIRE_NATDEP");

    public final NumberPath<Long> idAdmEbSignataireNatdep = createNumber("idAdmEbSignataireNatdep", Long.class);

    public final NumberPath<Long> idAdmNatureDep = createNumber("idAdmNatureDep", Long.class);

    public final NumberPath<java.math.BigDecimal> maxMontantTtc = createNumber("maxMontantTtc", java.math.BigDecimal.class);

    public final NumberPath<Long> orsiId = createNumber("orsiId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAdmEbSignataireNatdep> admEbSignataireNatdepPk = createPrimaryKey(idAdmEbSignataireNatdep);

    public QAdmEbSignataireNatdep(String variable) {
        super(QAdmEbSignataireNatdep.class, forVariable(variable), "GFC", "ADM_EB_SIGNATAIRE_NATDEP");
        addMetadata();
    }

    public QAdmEbSignataireNatdep(String variable, String schema, String table) {
        super(QAdmEbSignataireNatdep.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmEbSignataireNatdep(Path<? extends QAdmEbSignataireNatdep> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_EB_SIGNATAIRE_NATDEP");
        addMetadata();
    }

    public QAdmEbSignataireNatdep(PathMetadata metadata) {
        super(QAdmEbSignataireNatdep.class, metadata, "GFC", "ADM_EB_SIGNATAIRE_NATDEP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmEbSignataireNatdep, ColumnMetadata.named("ID_ADM_EB_SIGNATAIRE_NATDEP").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmNatureDep, ColumnMetadata.named("ID_ADM_NATURE_DEP").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(maxMontantTtc, ColumnMetadata.named("MAX_MONTANT_TTC").withIndex(4).ofType(Types.DECIMAL).withSize(12).withDigits(2).notNull());
        addMetadata(orsiId, ColumnMetadata.named("ORSI_ID").withIndex(3).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


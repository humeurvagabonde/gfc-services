package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmDonneesCafTb is a Querydsl query type for QAdmDonneesCafTb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmDonneesCafTb extends com.querydsl.sql.RelationalPathBase<QAdmDonneesCafTb> {

    private static final long serialVersionUID = -1685206642;

    public static final QAdmDonneesCafTb admDonneesCafTb = new QAdmDonneesCafTb("ADM_DONNEES_CAF_TB");

    public final NumberPath<Long> idAdmDonneesCafTb = createNumber("idAdmDonneesCafTb", Long.class);

    public final StringPath libelleLigne = createString("libelleLigne");

    public final NumberPath<Long> numLigne = createNumber("numLigne", Long.class);

    public final StringPath sens = createString("sens");

    public final StringPath sousTb = createString("sousTb");

    public final StringPath tb = createString("tb");

    public final com.querydsl.sql.PrimaryKey<QAdmDonneesCafTb> idAdmDonneesCafTbPk = createPrimaryKey(idAdmDonneesCafTb);

    public QAdmDonneesCafTb(String variable) {
        super(QAdmDonneesCafTb.class, forVariable(variable), "GFC", "ADM_DONNEES_CAF_TB");
        addMetadata();
    }

    public QAdmDonneesCafTb(String variable, String schema, String table) {
        super(QAdmDonneesCafTb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmDonneesCafTb(Path<? extends QAdmDonneesCafTb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_DONNEES_CAF_TB");
        addMetadata();
    }

    public QAdmDonneesCafTb(PathMetadata metadata) {
        super(QAdmDonneesCafTb.class, metadata, "GFC", "ADM_DONNEES_CAF_TB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmDonneesCafTb, ColumnMetadata.named("ID_ADM_DONNEES_CAF_TB").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelleLigne, ColumnMetadata.named("LIBELLE_LIGNE").withIndex(5).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(numLigne, ColumnMetadata.named("NUM_LIGNE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(sens, ColumnMetadata.named("SENS").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(sousTb, ColumnMetadata.named("SOUS_TB").withIndex(3).ofType(Types.VARCHAR).withSize(8).notNull());
        addMetadata(tb, ColumnMetadata.named("TB").withIndex(2).ofType(Types.VARCHAR).withSize(8).notNull());
    }

}


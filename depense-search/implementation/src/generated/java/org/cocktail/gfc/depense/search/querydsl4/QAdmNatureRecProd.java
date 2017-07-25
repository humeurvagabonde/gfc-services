package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmNatureRecProd is a Querydsl query type for QAdmNatureRecProd
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmNatureRecProd extends com.querydsl.sql.RelationalPathBase<QAdmNatureRecProd> {

    private static final long serialVersionUID = -690729824;

    public static final QAdmNatureRecProd admNatureRecProd = new QAdmNatureRecProd("ADM_NATURE_REC_PROD");

    public final StringPath code = createString("code");

    public final NumberPath<Long> idAdmNatureRecProd = createNumber("idAdmNatureRecProd", Long.class);

    public final StringPath libelleLigne = createString("libelleLigne");

    public final NumberPath<Long> numLigne = createNumber("numLigne", Long.class);

    public final StringPath section = createString("section");

    public final StringPath sousTb = createString("sousTb");

    public final StringPath tb = createString("tb");

    public final StringPath typeInformation = createString("typeInformation");

    public final com.querydsl.sql.PrimaryKey<QAdmNatureRecProd> idAdmNatRecProdPk = createPrimaryKey(idAdmNatureRecProd);

    public QAdmNatureRecProd(String variable) {
        super(QAdmNatureRecProd.class, forVariable(variable), "GFC", "ADM_NATURE_REC_PROD");
        addMetadata();
    }

    public QAdmNatureRecProd(String variable, String schema, String table) {
        super(QAdmNatureRecProd.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmNatureRecProd(Path<? extends QAdmNatureRecProd> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_NATURE_REC_PROD");
        addMetadata();
    }

    public QAdmNatureRecProd(PathMetadata metadata) {
        super(QAdmNatureRecProd.class, metadata, "GFC", "ADM_NATURE_REC_PROD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(7).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(idAdmNatureRecProd, ColumnMetadata.named("ID_ADM_NATURE_REC_PROD").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelleLigne, ColumnMetadata.named("LIBELLE_LIGNE").withIndex(5).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(numLigne, ColumnMetadata.named("NUM_LIGNE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(section, ColumnMetadata.named("SECTION").withIndex(8).ofType(Types.VARCHAR).withSize(1));
        addMetadata(sousTb, ColumnMetadata.named("SOUS_TB").withIndex(3).ofType(Types.VARCHAR).withSize(8).notNull());
        addMetadata(tb, ColumnMetadata.named("TB").withIndex(2).ofType(Types.VARCHAR).withSize(8).notNull());
        addMetadata(typeInformation, ColumnMetadata.named("TYPE_INFORMATION").withIndex(6).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


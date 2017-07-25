package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVFournisLight is a Querydsl query type for QVFournisLight
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVFournisLight extends com.querydsl.sql.RelationalPathBase<QVFournisLight> {

    private static final long serialVersionUID = -1299881712;

    public static final QVFournisLight vFournisLight = new QVFournisLight("V_FOURNIS_LIGHT");

    public final StringPath civilite = createString("civilite");

    public final NumberPath<Long> cptOrdre = createNumber("cptOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final StringPath fouCode = createString("fouCode");

    public final DateTimePath<java.sql.Timestamp> fouDate = createDateTime("fouDate", java.sql.Timestamp.class);

    public final StringPath fouEtranger = createString("fouEtranger");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath fouType = createString("fouType");

    public final StringPath fouValide = createString("fouValide");

    public final StringPath libelle = createString("libelle");

    public final StringPath nom = createString("nom");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath prenom = createString("prenom");

    public final StringPath siret = createString("siret");

    public QVFournisLight(String variable) {
        super(QVFournisLight.class, forVariable(variable), "GFC", "V_FOURNIS_LIGHT");
        addMetadata();
    }

    public QVFournisLight(String variable, String schema, String table) {
        super(QVFournisLight.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVFournisLight(Path<? extends QVFournisLight> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_FOURNIS_LIGHT");
        addMetadata();
    }

    public QVFournisLight(PathMetadata metadata) {
        super(QVFournisLight.class, metadata, "GFC", "V_FOURNIS_LIGHT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(civilite, ColumnMetadata.named("CIVILITE").withIndex(13).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(cptOrdre, ColumnMetadata.named("CPT_ORDRE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(8).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(fouCode, ColumnMetadata.named("FOU_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(fouDate, ColumnMetadata.named("FOU_DATE").withIndex(4).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(fouEtranger, ColumnMetadata.named("FOU_ETRANGER").withIndex(10).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(fouType, ColumnMetadata.named("FOU_TYPE").withIndex(6).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(fouValide, ColumnMetadata.named("FOU_VALIDE").withIndex(5).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(15).ofType(Types.VARCHAR).withSize(254));
        addMetadata(nom, ColumnMetadata.named("NOM").withIndex(11).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prenom, ColumnMetadata.named("PRENOM").withIndex(12).ofType(Types.VARCHAR).withSize(40));
        addMetadata(siret, ColumnMetadata.named("SIRET").withIndex(14).ofType(Types.VARCHAR).withSize(14));
    }

}


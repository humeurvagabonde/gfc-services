package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepVFournisseur is a Querydsl query type for QDepVFournisseur
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepVFournisseur extends com.querydsl.sql.RelationalPathBase<QDepVFournisseur> {

    private static final long serialVersionUID = 514841840;

    public static final QDepVFournisseur depVFournisseur = new QDepVFournisseur("DEP_V_FOURNISSEUR");

    public final StringPath adrAdresse1 = createString("adrAdresse1");

    public final StringPath adrAdresse2 = createString("adrAdresse2");

    public final StringPath adrBp = createString("adrBp");

    public final StringPath adrCivilite = createString("adrCivilite");

    public final StringPath adrCp = createString("adrCp");

    public final StringPath adrCpEtranger = createString("adrCpEtranger");

    public final StringPath adrNom = createString("adrNom");

    public final NumberPath<Long> adrOrdre = createNumber("adrOrdre", Long.class);

    public final StringPath adrPrenom = createString("adrPrenom");

    public final StringPath adrVille = createString("adrVille");

    public final NumberPath<Long> agtOrdre = createNumber("agtOrdre", Long.class);

    public final NumberPath<Long> cptOrdre = createNumber("cptOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final StringPath fouCode = createString("fouCode");

    public final DateTimePath<java.sql.Timestamp> fouDate = createDateTime("fouDate", java.sql.Timestamp.class);

    public final StringPath fouEtranger = createString("fouEtranger");

    public final StringPath fouMarche = createString("fouMarche");

    public final StringPath fouNom = createString("fouNom");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath fouType = createString("fouType");

    public final StringPath fouValide = createString("fouValide");

    public final StringPath pays = createString("pays");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath siret = createString("siret");

    public QDepVFournisseur(String variable) {
        super(QDepVFournisseur.class, forVariable(variable), "GFC", "DEP_V_FOURNISSEUR");
        addMetadata();
    }

    public QDepVFournisseur(String variable, String schema, String table) {
        super(QDepVFournisseur.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepVFournisseur(Path<? extends QDepVFournisseur> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_V_FOURNISSEUR");
        addMetadata();
    }

    public QDepVFournisseur(PathMetadata metadata) {
        super(QDepVFournisseur.class, metadata, "GFC", "DEP_V_FOURNISSEUR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrAdresse1, ColumnMetadata.named("ADR_ADRESSE1").withIndex(14).ofType(Types.VARCHAR).withSize(100));
        addMetadata(adrAdresse2, ColumnMetadata.named("ADR_ADRESSE2").withIndex(15).ofType(Types.VARCHAR).withSize(300));
        addMetadata(adrBp, ColumnMetadata.named("ADR_BP").withIndex(23).ofType(Types.VARCHAR).withSize(7));
        addMetadata(adrCivilite, ColumnMetadata.named("ADR_CIVILITE").withIndex(20).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(adrCp, ColumnMetadata.named("ADR_CP").withIndex(16).ofType(Types.VARCHAR).withSize(10));
        addMetadata(adrCpEtranger, ColumnMetadata.named("ADR_CP_ETRANGER").withIndex(22).ofType(Types.VARCHAR).withSize(10));
        addMetadata(adrNom, ColumnMetadata.named("ADR_NOM").withIndex(18).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(adrOrdre, ColumnMetadata.named("ADR_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(adrPrenom, ColumnMetadata.named("ADR_PRENOM").withIndex(19).ofType(Types.VARCHAR).withSize(40));
        addMetadata(adrVille, ColumnMetadata.named("ADR_VILLE").withIndex(17).ofType(Types.VARCHAR).withSize(60));
        addMetadata(agtOrdre, ColumnMetadata.named("AGT_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(cptOrdre, ColumnMetadata.named("CPT_ORDRE").withIndex(12).ofType(Types.DECIMAL).withSize(0));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(fouCode, ColumnMetadata.named("FOU_CODE").withIndex(4).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(fouDate, ColumnMetadata.named("FOU_DATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(fouEtranger, ColumnMetadata.named("FOU_ETRANGER").withIndex(13).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(fouMarche, ColumnMetadata.named("FOU_MARCHE").withIndex(6).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(fouNom, ColumnMetadata.named("FOU_NOM").withIndex(21).ofType(Types.VARCHAR).withSize(241));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(fouType, ColumnMetadata.named("FOU_TYPE").withIndex(9).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(fouValide, ColumnMetadata.named("FOU_VALIDE").withIndex(7).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(pays, ColumnMetadata.named("PAYS").withIndex(24).ofType(Types.VARCHAR).withSize(20));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(siret, ColumnMetadata.named("SIRET").withIndex(25).ofType(Types.VARCHAR).withSize(14));
    }

}


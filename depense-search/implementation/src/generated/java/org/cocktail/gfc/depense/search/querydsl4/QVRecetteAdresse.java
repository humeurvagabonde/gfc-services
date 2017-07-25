package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVRecetteAdresse is a Querydsl query type for QVRecetteAdresse
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVRecetteAdresse extends com.querydsl.sql.RelationalPathBase<QVRecetteAdresse> {

    private static final long serialVersionUID = 1852029867;

    public static final QVRecetteAdresse vRecetteAdresse = new QVRecetteAdresse("V_RECETTE_ADRESSE");

    public final StringPath adrAdresse1 = createString("adrAdresse1");

    public final StringPath adrAdresse2 = createString("adrAdresse2");

    public final StringPath adrBp = createString("adrBp");

    public final StringPath adresse = createString("adresse");

    public final NumberPath<Long> adrOrdre = createNumber("adrOrdre", Long.class);

    public final StringPath civilite = createString("civilite");

    public final StringPath codePostal = createString("codePostal");

    public final StringPath cPays = createString("cPays");

    public final StringPath cpEtranger = createString("cpEtranger");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath nom = createString("nom");

    public final StringPath prenom = createString("prenom");

    public final NumberPath<Long> recId = createNumber("recId", Long.class);

    public final NumberPath<Long> rpcoId = createNumber("rpcoId", Long.class);

    public final NumberPath<Long> titId = createNumber("titId", Long.class);

    public final StringPath ville = createString("ville");

    public QVRecetteAdresse(String variable) {
        super(QVRecetteAdresse.class, forVariable(variable), "GFC", "V_RECETTE_ADRESSE");
        addMetadata();
    }

    public QVRecetteAdresse(String variable, String schema, String table) {
        super(QVRecetteAdresse.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVRecetteAdresse(Path<? extends QVRecetteAdresse> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_RECETTE_ADRESSE");
        addMetadata();
    }

    public QVRecetteAdresse(PathMetadata metadata) {
        super(QVRecetteAdresse.class, metadata, "GFC", "V_RECETTE_ADRESSE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrAdresse1, ColumnMetadata.named("ADR_ADRESSE1").withIndex(9).ofType(Types.VARCHAR).withSize(100));
        addMetadata(adrAdresse2, ColumnMetadata.named("ADR_ADRESSE2").withIndex(10).ofType(Types.VARCHAR).withSize(300));
        addMetadata(adrBp, ColumnMetadata.named("ADR_BP").withIndex(11).ofType(Types.VARCHAR).withSize(7));
        addMetadata(adresse, ColumnMetadata.named("ADRESSE").withIndex(15).ofType(Types.VARCHAR).withSize(522));
        addMetadata(adrOrdre, ColumnMetadata.named("ADR_ORDRE").withIndex(8).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(civilite, ColumnMetadata.named("CIVILITE").withIndex(5).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(codePostal, ColumnMetadata.named("CODE_POSTAL").withIndex(12).ofType(Types.VARCHAR).withSize(10));
        addMetadata(cPays, ColumnMetadata.named("C_PAYS").withIndex(16).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(cpEtranger, ColumnMetadata.named("CP_ETRANGER").withIndex(14).ofType(Types.VARCHAR).withSize(10));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(4).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(nom, ColumnMetadata.named("NOM").withIndex(6).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(prenom, ColumnMetadata.named("PRENOM").withIndex(7).ofType(Types.VARCHAR).withSize(40));
        addMetadata(recId, ColumnMetadata.named("REC_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rpcoId, ColumnMetadata.named("RPCO_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(titId, ColumnMetadata.named("TIT_ID").withIndex(3).ofType(Types.DECIMAL).withSize(0));
        addMetadata(ville, ColumnMetadata.named("VILLE").withIndex(13).ofType(Types.VARCHAR).withSize(60));
    }

}


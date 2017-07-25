package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCodeMarcheAll is a Querydsl query type for QVCodeMarcheAll
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCodeMarcheAll extends com.querydsl.sql.RelationalPathBase<QVCodeMarcheAll> {

    private static final long serialVersionUID = 505479622;

    public static final QVCodeMarcheAll vCodeMarcheAll = new QVCodeMarcheAll("V_CODE_MARCHE_ALL");

    public final StringPath cmCode = createString("cmCode");

    public final StringPath cmLib = createString("cmLib");

    public final NumberPath<Long> cmNiveau = createNumber("cmNiveau", Long.class);

    public final NumberPath<Long> derniereAnnee = createNumber("derniereAnnee", Long.class);

    public final NumberPath<Long> nbAnneesUtilise = createNumber("nbAnneesUtilise", Long.class);

    public final StringPath tcnLibelle = createString("tcnLibelle");

    public QVCodeMarcheAll(String variable) {
        super(QVCodeMarcheAll.class, forVariable(variable), "GFC", "V_CODE_MARCHE_ALL");
        addMetadata();
    }

    public QVCodeMarcheAll(String variable, String schema, String table) {
        super(QVCodeMarcheAll.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCodeMarcheAll(Path<? extends QVCodeMarcheAll> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CODE_MARCHE_ALL");
        addMetadata();
    }

    public QVCodeMarcheAll(PathMetadata metadata) {
        super(QVCodeMarcheAll.class, metadata, "GFC", "V_CODE_MARCHE_ALL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cmCode, ColumnMetadata.named("CM_CODE").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(cmLib, ColumnMetadata.named("CM_LIB").withIndex(3).ofType(Types.VARCHAR).withSize(150).notNull());
        addMetadata(cmNiveau, ColumnMetadata.named("CM_NIVEAU").withIndex(2).ofType(Types.DECIMAL).withSize(22));
        addMetadata(derniereAnnee, ColumnMetadata.named("DERNIERE_ANNEE").withIndex(6).ofType(Types.DECIMAL).withSize(0));
        addMetadata(nbAnneesUtilise, ColumnMetadata.named("NB_ANNEES_UTILISE").withIndex(5).ofType(Types.DECIMAL).withSize(0));
        addMetadata(tcnLibelle, ColumnMetadata.named("TCN_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(50));
    }

}


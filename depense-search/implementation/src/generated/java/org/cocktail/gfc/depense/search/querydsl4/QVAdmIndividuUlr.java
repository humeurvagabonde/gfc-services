package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmIndividuUlr is a Querydsl query type for QVAdmIndividuUlr
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmIndividuUlr extends com.querydsl.sql.RelationalPathBase<QVAdmIndividuUlr> {

    private static final long serialVersionUID = 554459631;

    public static final QVAdmIndividuUlr vAdmIndividuUlr = new QVAdmIndividuUlr("V_ADM_INDIVIDU_ULR");

    public final StringPath cCivilite = createString("cCivilite");

    public final StringPath cDeptNaissance = createString("cDeptNaissance");

    public final StringPath cPaysNaissance = createString("cPaysNaissance");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dNaissance = createDateTime("dNaissance", java.sql.Timestamp.class);

    public final StringPath indActivite = createString("indActivite");

    public final NumberPath<Integer> indCleInsee = createNumber("indCleInsee", Integer.class);

    public final StringPath indCSituationFamille = createString("indCSituationFamille");

    public final StringPath indNoInsee = createString("indNoInsee");

    public final StringPath indOrigine = createString("indOrigine");

    public final StringPath indPhoto = createString("indPhoto");

    public final StringPath indQualite = createString("indQualite");

    public final NumberPath<Integer> noIndividu = createNumber("noIndividu", Integer.class);

    public final StringPath nomPatronymique = createString("nomPatronymique");

    public final StringPath nomUsuel = createString("nomUsuel");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath prenom = createString("prenom");

    public final StringPath prenom2 = createString("prenom2");

    public final StringPath temValide = createString("temValide");

    public final StringPath villeDeNaissance = createString("villeDeNaissance");

    public QVAdmIndividuUlr(String variable) {
        super(QVAdmIndividuUlr.class, forVariable(variable), "GFC", "V_ADM_INDIVIDU_ULR");
        addMetadata();
    }

    public QVAdmIndividuUlr(String variable, String schema, String table) {
        super(QVAdmIndividuUlr.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmIndividuUlr(Path<? extends QVAdmIndividuUlr> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_INDIVIDU_ULR");
        addMetadata();
    }

    public QVAdmIndividuUlr(PathMetadata metadata) {
        super(QVAdmIndividuUlr.class, metadata, "GFC", "V_ADM_INDIVIDU_ULR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cCivilite, ColumnMetadata.named("C_CIVILITE").withIndex(5).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(cDeptNaissance, ColumnMetadata.named("C_DEPT_NAISSANCE").withIndex(10).ofType(Types.VARCHAR).withSize(3));
        addMetadata(cPaysNaissance, ColumnMetadata.named("C_PAYS_NAISSANCE").withIndex(11).ofType(Types.VARCHAR).withSize(3));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(19).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(20).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dNaissance, ColumnMetadata.named("D_NAISSANCE").withIndex(8).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(indActivite, ColumnMetadata.named("IND_ACTIVITE").withIndex(17).ofType(Types.VARCHAR).withSize(100));
        addMetadata(indCleInsee, ColumnMetadata.named("IND_CLE_INSEE").withIndex(14).ofType(Types.DECIMAL).withSize(2));
        addMetadata(indCSituationFamille, ColumnMetadata.named("IND_C_SITUATION_FAMILLE").withIndex(12).ofType(Types.VARCHAR).withSize(1));
        addMetadata(indNoInsee, ColumnMetadata.named("IND_NO_INSEE").withIndex(13).ofType(Types.VARCHAR).withSize(13));
        addMetadata(indOrigine, ColumnMetadata.named("IND_ORIGINE").withIndex(18).ofType(Types.VARCHAR).withSize(80));
        addMetadata(indPhoto, ColumnMetadata.named("IND_PHOTO").withIndex(16).ofType(Types.VARCHAR).withSize(1));
        addMetadata(indQualite, ColumnMetadata.named("IND_QUALITE").withIndex(15).ofType(Types.VARCHAR).withSize(120));
        addMetadata(noIndividu, ColumnMetadata.named("NO_INDIVIDU").withIndex(1).ofType(Types.DECIMAL).withSize(8).notNull());
        addMetadata(nomPatronymique, ColumnMetadata.named("NOM_PATRONYMIQUE").withIndex(3).ofType(Types.VARCHAR).withSize(80));
        addMetadata(nomUsuel, ColumnMetadata.named("NOM_USUEL").withIndex(6).ofType(Types.VARCHAR).withSize(80).notNull());
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(prenom, ColumnMetadata.named("PRENOM").withIndex(4).ofType(Types.VARCHAR).withSize(40));
        addMetadata(prenom2, ColumnMetadata.named("PRENOM2").withIndex(7).ofType(Types.VARCHAR).withSize(40));
        addMetadata(temValide, ColumnMetadata.named("TEM_VALIDE").withIndex(21).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(villeDeNaissance, ColumnMetadata.named("VILLE_DE_NAISSANCE").withIndex(9).ofType(Types.VARCHAR).withSize(60));
    }

}


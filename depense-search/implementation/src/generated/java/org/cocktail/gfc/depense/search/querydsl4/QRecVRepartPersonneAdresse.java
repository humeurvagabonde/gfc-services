package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRecVRepartPersonneAdresse is a Querydsl query type for QRecVRepartPersonneAdresse
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRecVRepartPersonneAdresse extends com.querydsl.sql.RelationalPathBase<QRecVRepartPersonneAdresse> {

    private static final long serialVersionUID = 1185366797;

    public static final QRecVRepartPersonneAdresse recVRepartPersonneAdresse = new QRecVRepartPersonneAdresse("REC_V_REPART_PERSONNE_ADRESSE");

    public final StringPath adrAdresse1 = createString("adrAdresse1");

    public final StringPath adrAdresse2 = createString("adrAdresse2");

    public final StringPath adrBp = createString("adrBp");

    public final NumberPath<Long> adrOrdre = createNumber("adrOrdre", Long.class);

    public final StringPath bisTer = createString("bisTer");

    public final StringPath codePostal = createString("codePostal");

    public final StringPath cpEtranger = createString("cpEtranger");

    public final StringPath cVoie = createString("cVoie");

    public final StringPath eMail = createString("eMail");

    public final StringPath habitantChez = createString("habitantChez");

    public final StringPath lcPays = createString("lcPays");

    public final StringPath llPays = createString("llPays");

    public final StringPath localite = createString("localite");

    public final StringPath nomVoie = createString("nomVoie");

    public final StringPath noVoie = createString("noVoie");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath rpaPrincipal = createString("rpaPrincipal");

    public final StringPath tadrCode = createString("tadrCode");

    public final StringPath ville = createString("ville");

    public QRecVRepartPersonneAdresse(String variable) {
        super(QRecVRepartPersonneAdresse.class, forVariable(variable), "GFC", "REC_V_REPART_PERSONNE_ADRESSE");
        addMetadata();
    }

    public QRecVRepartPersonneAdresse(String variable, String schema, String table) {
        super(QRecVRepartPersonneAdresse.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRecVRepartPersonneAdresse(Path<? extends QRecVRepartPersonneAdresse> path) {
        super(path.getType(), path.getMetadata(), "GFC", "REC_V_REPART_PERSONNE_ADRESSE");
        addMetadata();
    }

    public QRecVRepartPersonneAdresse(PathMetadata metadata) {
        super(QRecVRepartPersonneAdresse.class, metadata, "GFC", "REC_V_REPART_PERSONNE_ADRESSE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrAdresse1, ColumnMetadata.named("ADR_ADRESSE1").withIndex(15).ofType(Types.VARCHAR).withSize(100));
        addMetadata(adrAdresse2, ColumnMetadata.named("ADR_ADRESSE2").withIndex(16).ofType(Types.VARCHAR).withSize(300));
        addMetadata(adrBp, ColumnMetadata.named("ADR_BP").withIndex(17).ofType(Types.VARCHAR).withSize(7));
        addMetadata(adrOrdre, ColumnMetadata.named("ADR_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(bisTer, ColumnMetadata.named("BIS_TER").withIndex(8).ofType(Types.VARCHAR).withSize(1));
        addMetadata(codePostal, ColumnMetadata.named("CODE_POSTAL").withIndex(12).ofType(Types.VARCHAR).withSize(10));
        addMetadata(cpEtranger, ColumnMetadata.named("CP_ETRANGER").withIndex(14).ofType(Types.VARCHAR).withSize(10));
        addMetadata(cVoie, ColumnMetadata.named("C_VOIE").withIndex(9).ofType(Types.VARCHAR).withSize(4));
        addMetadata(eMail, ColumnMetadata.named("E_MAIL").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(habitantChez, ColumnMetadata.named("HABITANT_CHEZ").withIndex(6).ofType(Types.VARCHAR).withSize(32));
        addMetadata(lcPays, ColumnMetadata.named("LC_PAYS").withIndex(18).ofType(Types.VARCHAR).withSize(20));
        addMetadata(llPays, ColumnMetadata.named("LL_PAYS").withIndex(19).ofType(Types.VARCHAR).withSize(40));
        addMetadata(localite, ColumnMetadata.named("LOCALITE").withIndex(11).ofType(Types.VARCHAR).withSize(60));
        addMetadata(nomVoie, ColumnMetadata.named("NOM_VOIE").withIndex(10).ofType(Types.VARCHAR).withSize(30));
        addMetadata(noVoie, ColumnMetadata.named("NO_VOIE").withIndex(7).ofType(Types.VARCHAR).withSize(4));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rpaPrincipal, ColumnMetadata.named("RPA_PRINCIPAL").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(tadrCode, ColumnMetadata.named("TADR_CODE").withIndex(5).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(ville, ColumnMetadata.named("VILLE").withIndex(13).ofType(Types.VARCHAR).withSize(60));
    }

}


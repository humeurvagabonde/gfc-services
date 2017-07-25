package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmAdresse is a Querydsl query type for QVAdmAdresse
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmAdresse extends com.querydsl.sql.RelationalPathBase<QVAdmAdresse> {

    private static final long serialVersionUID = 419454897;

    public static final QVAdmAdresse vAdmAdresse = new QVAdmAdresse("V_ADM_ADRESSE");

    public final StringPath adrAdresse1 = createString("adrAdresse1");

    public final StringPath adrAdresse2 = createString("adrAdresse2");

    public final StringPath adrBp = createString("adrBp");

    public final StringPath adrListeRouge = createString("adrListeRouge");

    public final NumberPath<Long> adrOrdre = createNumber("adrOrdre", Long.class);

    public final StringPath adrUrlPere = createString("adrUrlPere");

    public final StringPath adrUrlRelative = createString("adrUrlRelative");

    public final StringPath adrUrlTemplate = createString("adrUrlTemplate");

    public final StringPath bisTer = createString("bisTer");

    public final StringPath cImplantation = createString("cImplantation");

    public final StringPath codePostal = createString("codePostal");

    public final StringPath cPays = createString("cPays");

    public final StringPath cpEtranger = createString("cpEtranger");

    public final StringPath cVoie = createString("cVoie");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dDebVal = createDateTime("dDebVal", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dFinVal = createDateTime("dFinVal", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final StringPath habitantChez = createString("habitantChez");

    public final StringPath localite = createString("localite");

    public final StringPath nomVoie = createString("nomVoie");

    public final StringPath noVoie = createString("noVoie");

    public final StringPath temPayeUtil = createString("temPayeUtil");

    public final StringPath ville = createString("ville");

    public QVAdmAdresse(String variable) {
        super(QVAdmAdresse.class, forVariable(variable), "GFC", "V_ADM_ADRESSE");
        addMetadata();
    }

    public QVAdmAdresse(String variable, String schema, String table) {
        super(QVAdmAdresse.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmAdresse(Path<? extends QVAdmAdresse> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_ADRESSE");
        addMetadata();
    }

    public QVAdmAdresse(PathMetadata metadata) {
        super(QVAdmAdresse.class, metadata, "GFC", "V_ADM_ADRESSE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrAdresse1, ColumnMetadata.named("ADR_ADRESSE1").withIndex(15).ofType(Types.VARCHAR).withSize(100));
        addMetadata(adrAdresse2, ColumnMetadata.named("ADR_ADRESSE2").withIndex(16).ofType(Types.VARCHAR).withSize(300));
        addMetadata(adrBp, ColumnMetadata.named("ADR_BP").withIndex(17).ofType(Types.VARCHAR).withSize(7));
        addMetadata(adrListeRouge, ColumnMetadata.named("ADR_LISTE_ROUGE").withIndex(21).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(adrOrdre, ColumnMetadata.named("ADR_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(adrUrlPere, ColumnMetadata.named("ADR_URL_PERE").withIndex(18).ofType(Types.VARCHAR).withSize(100));
        addMetadata(adrUrlRelative, ColumnMetadata.named("ADR_URL_RELATIVE").withIndex(19).ofType(Types.VARCHAR).withSize(100));
        addMetadata(adrUrlTemplate, ColumnMetadata.named("ADR_URL_TEMPLATE").withIndex(20).ofType(Types.VARCHAR).withSize(100));
        addMetadata(bisTer, ColumnMetadata.named("BIS_TER").withIndex(4).ofType(Types.VARCHAR).withSize(1));
        addMetadata(cImplantation, ColumnMetadata.named("C_IMPLANTATION").withIndex(12).ofType(Types.VARCHAR).withSize(2));
        addMetadata(codePostal, ColumnMetadata.named("CODE_POSTAL").withIndex(8).ofType(Types.VARCHAR).withSize(10));
        addMetadata(cPays, ColumnMetadata.named("C_PAYS").withIndex(10).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(cpEtranger, ColumnMetadata.named("CP_ETRANGER").withIndex(11).ofType(Types.VARCHAR).withSize(10));
        addMetadata(cVoie, ColumnMetadata.named("C_VOIE").withIndex(5).ofType(Types.VARCHAR).withSize(4));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(22).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dDebVal, ColumnMetadata.named("D_DEB_VAL").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dFinVal, ColumnMetadata.named("D_FIN_VAL").withIndex(14).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(23).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(habitantChez, ColumnMetadata.named("HABITANT_CHEZ").withIndex(2).ofType(Types.VARCHAR).withSize(32));
        addMetadata(localite, ColumnMetadata.named("LOCALITE").withIndex(7).ofType(Types.VARCHAR).withSize(60));
        addMetadata(nomVoie, ColumnMetadata.named("NOM_VOIE").withIndex(6).ofType(Types.VARCHAR).withSize(30));
        addMetadata(noVoie, ColumnMetadata.named("NO_VOIE").withIndex(3).ofType(Types.VARCHAR).withSize(4));
        addMetadata(temPayeUtil, ColumnMetadata.named("TEM_PAYE_UTIL").withIndex(24).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(ville, ColumnMetadata.named("VILLE").withIndex(9).ofType(Types.VARCHAR).withSize(60));
    }

}


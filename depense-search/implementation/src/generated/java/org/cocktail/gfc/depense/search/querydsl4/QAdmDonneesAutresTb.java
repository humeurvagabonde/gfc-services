package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmDonneesAutresTb is a Querydsl query type for QAdmDonneesAutresTb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmDonneesAutresTb extends com.querydsl.sql.RelationalPathBase<QAdmDonneesAutresTb> {

    private static final long serialVersionUID = 1689918518;

    public static final QAdmDonneesAutresTb admDonneesAutresTb = new QAdmDonneesAutresTb("ADM_DONNEES_AUTRES_TB");

    public final NumberPath<Long> idAdmDonneesAutresTb = createNumber("idAdmDonneesAutresTb", Long.class);

    public final StringPath libelleLigne = createString("libelleLigne");

    public final NumberPath<Long> numLigne = createNumber("numLigne", Long.class);

    public final StringPath sousTb = createString("sousTb");

    public final StringPath tb = createString("tb");

    public final StringPath typeInformation = createString("typeInformation");

    public final com.querydsl.sql.PrimaryKey<QAdmDonneesAutresTb> idAdmDonneesAutresTbPk = createPrimaryKey(idAdmDonneesAutresTb);

    public QAdmDonneesAutresTb(String variable) {
        super(QAdmDonneesAutresTb.class, forVariable(variable), "GFC", "ADM_DONNEES_AUTRES_TB");
        addMetadata();
    }

    public QAdmDonneesAutresTb(String variable, String schema, String table) {
        super(QAdmDonneesAutresTb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmDonneesAutresTb(Path<? extends QAdmDonneesAutresTb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_DONNEES_AUTRES_TB");
        addMetadata();
    }

    public QAdmDonneesAutresTb(PathMetadata metadata) {
        super(QAdmDonneesAutresTb.class, metadata, "GFC", "ADM_DONNEES_AUTRES_TB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmDonneesAutresTb, ColumnMetadata.named("ID_ADM_DONNEES_AUTRES_TB").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelleLigne, ColumnMetadata.named("LIBELLE_LIGNE").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(numLigne, ColumnMetadata.named("NUM_LIGNE").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(sousTb, ColumnMetadata.named("SOUS_TB").withIndex(6).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(tb, ColumnMetadata.named("TB").withIndex(2).ofType(Types.VARCHAR).withSize(8).notNull());
        addMetadata(typeInformation, ColumnMetadata.named("TYPE_INFORMATION").withIndex(5).ofType(Types.VARCHAR).withSize(20).notNull());
    }

}


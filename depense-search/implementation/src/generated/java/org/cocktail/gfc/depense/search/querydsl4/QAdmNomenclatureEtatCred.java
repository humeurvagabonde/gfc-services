package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmNomenclatureEtatCred is a Querydsl query type for QAdmNomenclatureEtatCred
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmNomenclatureEtatCred extends com.querydsl.sql.RelationalPathBase<QAdmNomenclatureEtatCred> {

    private static final long serialVersionUID = 1999727335;

    public static final QAdmNomenclatureEtatCred admNomenclatureEtatCred = new QAdmNomenclatureEtatCred("ADM_NOMENCLATURE_ETAT_CRED");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final StringPath necCode = createString("necCode");

    public final StringPath necDetails = createString("necDetails");

    public final NumberPath<Long> necId = createNumber("necId", Long.class);

    public final StringPath necLibelle = createString("necLibelle");

    public final com.querydsl.sql.PrimaryKey<QAdmNomenclatureEtatCred> sysC0022308 = createPrimaryKey(necId);

    public QAdmNomenclatureEtatCred(String variable) {
        super(QAdmNomenclatureEtatCred.class, forVariable(variable), "GFC", "ADM_NOMENCLATURE_ETAT_CRED");
        addMetadata();
    }

    public QAdmNomenclatureEtatCred(String variable, String schema, String table) {
        super(QAdmNomenclatureEtatCred.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmNomenclatureEtatCred(Path<? extends QAdmNomenclatureEtatCred> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_NOMENCLATURE_ETAT_CRED");
        addMetadata();
    }

    public QAdmNomenclatureEtatCred(PathMetadata metadata) {
        super(QAdmNomenclatureEtatCred.class, metadata, "GFC", "ADM_NOMENCLATURE_ETAT_CRED");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(necCode, ColumnMetadata.named("NEC_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(8).notNull());
        addMetadata(necDetails, ColumnMetadata.named("NEC_DETAILS").withIndex(5).ofType(Types.VARCHAR).withSize(200));
        addMetadata(necId, ColumnMetadata.named("NEC_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(necLibelle, ColumnMetadata.named("NEC_LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}


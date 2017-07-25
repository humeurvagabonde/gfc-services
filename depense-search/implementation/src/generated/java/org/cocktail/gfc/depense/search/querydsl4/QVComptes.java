package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVComptes is a Querydsl query type for QVComptes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVComptes extends com.querydsl.sql.RelationalPathBase<QVComptes> {

    private static final long serialVersionUID = 862452519;

    public static final QVComptes vComptes = new QVComptes("V_COMPTES");

    public final StringPath cptCharte = createString("cptCharte");

    public final StringPath cptConnexion = createString("cptConnexion");

    public final StringPath cptDomaine = createString("cptDomaine");

    public final StringPath cptEmail = createString("cptEmail");

    public final StringPath cptLogin = createString("cptLogin");

    public final NumberPath<Long> cptOrdre = createNumber("cptOrdre", Long.class);

    public final StringPath cptPasswd = createString("cptPasswd");

    public final NumberPath<Long> cptUidGid = createNumber("cptUidGid", Long.class);

    public final StringPath cptVlan = createString("cptVlan");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public QVComptes(String variable) {
        super(QVComptes.class, forVariable(variable), "GFC", "V_COMPTES");
        addMetadata();
    }

    public QVComptes(String variable, String schema, String table) {
        super(QVComptes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVComptes(Path<? extends QVComptes> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_COMPTES");
        addMetadata();
    }

    public QVComptes(PathMetadata metadata) {
        super(QVComptes.class, metadata, "GFC", "V_COMPTES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cptCharte, ColumnMetadata.named("CPT_CHARTE").withIndex(9).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(cptConnexion, ColumnMetadata.named("CPT_CONNEXION").withIndex(5).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(cptDomaine, ColumnMetadata.named("CPT_DOMAINE").withIndex(8).ofType(Types.VARCHAR).withSize(40));
        addMetadata(cptEmail, ColumnMetadata.named("CPT_EMAIL").withIndex(7).ofType(Types.VARCHAR).withSize(60));
        addMetadata(cptLogin, ColumnMetadata.named("CPT_LOGIN").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(cptOrdre, ColumnMetadata.named("CPT_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(cptPasswd, ColumnMetadata.named("CPT_PASSWD").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(cptUidGid, ColumnMetadata.named("CPT_UID_GID").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(cptVlan, ColumnMetadata.named("CPT_VLAN").withIndex(6).ofType(Types.VARCHAR).withSize(5).notNull());
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(10).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(11).ofType(Types.TIMESTAMP).withSize(7).notNull());
    }

}


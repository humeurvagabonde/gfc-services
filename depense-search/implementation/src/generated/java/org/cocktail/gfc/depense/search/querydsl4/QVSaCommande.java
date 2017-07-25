package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVSaCommande is a Querydsl query type for QVSaCommande
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVSaCommande extends com.querydsl.sql.RelationalPathBase<QVSaCommande> {

    private static final long serialVersionUID = 249401844;

    public static final QVSaCommande vSaCommande = new QVSaCommande("V_SA_COMMANDE");

    public final NumberPath<Long> commId = createNumber("commId", Long.class);

    public final StringPath saEmails = createString("saEmails");

    public final StringPath saLibelle = createString("saLibelle");

    public final NumberPath<Long> vcloId = createNumber("vcloId", Long.class);

    public final StringPath vlcoEtat = createString("vlcoEtat");

    public final StringPath vlcoValide = createString("vlcoValide");

    public QVSaCommande(String variable) {
        super(QVSaCommande.class, forVariable(variable), "GFC", "V_SA_COMMANDE");
        addMetadata();
    }

    public QVSaCommande(String variable, String schema, String table) {
        super(QVSaCommande.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVSaCommande(Path<? extends QVSaCommande> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_SA_COMMANDE");
        addMetadata();
    }

    public QVSaCommande(PathMetadata metadata) {
        super(QVSaCommande.class, metadata, "GFC", "V_SA_COMMANDE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commId, ColumnMetadata.named("COMM_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(saEmails, ColumnMetadata.named("SA_EMAILS").withIndex(4).ofType(Types.VARCHAR).withSize(4000));
        addMetadata(saLibelle, ColumnMetadata.named("SA_LIBELLE").withIndex(3).ofType(Types.VARCHAR).withSize(25).notNull());
        addMetadata(vcloId, ColumnMetadata.named("VCLO_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(vlcoEtat, ColumnMetadata.named("VLCO_ETAT").withIndex(6).ofType(Types.VARCHAR).withSize(25));
        addMetadata(vlcoValide, ColumnMetadata.named("VLCO_VALIDE").withIndex(5).ofType(Types.VARCHAR).withSize(25));
    }

}


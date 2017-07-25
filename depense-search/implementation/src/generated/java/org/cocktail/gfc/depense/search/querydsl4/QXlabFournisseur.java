package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXlabFournisseur is a Querydsl query type for QXlabFournisseur
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXlabFournisseur extends com.querydsl.sql.RelationalPathBase<QXlabFournisseur> {

    private static final long serialVersionUID = -1282732990;

    public static final QXlabFournisseur xlabFournisseur = new QXlabFournisseur("XLAB_FOURNISSEUR");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath xfouCode = createString("xfouCode");

    public final StringPath xfouCodeTva = createString("xfouCodeTva");

    public final StringPath xfouInsee = createString("xfouInsee");

    public final NumberPath<Long> xfouOrdre = createNumber("xfouOrdre", Long.class);

    public final StringPath xfouRaisonSoc = createString("xfouRaisonSoc");

    public final StringPath xfouSiret = createString("xfouSiret");

    public final com.querydsl.sql.PrimaryKey<QXlabFournisseur> xlabFournisseurPk = createPrimaryKey(xfouOrdre);

    public QXlabFournisseur(String variable) {
        super(QXlabFournisseur.class, forVariable(variable), "GFC", "XLAB_FOURNISSEUR");
        addMetadata();
    }

    public QXlabFournisseur(String variable, String schema, String table) {
        super(QXlabFournisseur.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXlabFournisseur(Path<? extends QXlabFournisseur> path) {
        super(path.getType(), path.getMetadata(), "GFC", "XLAB_FOURNISSEUR");
        addMetadata();
    }

    public QXlabFournisseur(PathMetadata metadata) {
        super(QXlabFournisseur.class, metadata, "GFC", "XLAB_FOURNISSEUR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
        addMetadata(xfouCode, ColumnMetadata.named("XFOU_CODE").withIndex(3).ofType(Types.VARCHAR).withSize(7));
        addMetadata(xfouCodeTva, ColumnMetadata.named("XFOU_CODE_TVA").withIndex(6).ofType(Types.VARCHAR).withSize(15));
        addMetadata(xfouInsee, ColumnMetadata.named("XFOU_INSEE").withIndex(5).ofType(Types.VARCHAR).withSize(13));
        addMetadata(xfouOrdre, ColumnMetadata.named("XFOU_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(xfouRaisonSoc, ColumnMetadata.named("XFOU_RAISON_SOC").withIndex(4).ofType(Types.VARCHAR).withSize(40).notNull());
        addMetadata(xfouSiret, ColumnMetadata.named("XFOU_SIRET").withIndex(7).ofType(Types.VARCHAR).withSize(14));
    }

}


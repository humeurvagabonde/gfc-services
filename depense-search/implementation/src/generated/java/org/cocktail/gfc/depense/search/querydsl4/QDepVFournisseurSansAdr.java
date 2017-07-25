package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDepVFournisseurSansAdr is a Querydsl query type for QDepVFournisseurSansAdr
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDepVFournisseurSansAdr extends com.querydsl.sql.RelationalPathBase<QDepVFournisseurSansAdr> {

    private static final long serialVersionUID = -2037817332;

    public static final QDepVFournisseurSansAdr depVFournisseurSansAdr = new QDepVFournisseurSansAdr("DEP_V_FOURNISSEUR_SANS_ADR");

    public final StringPath adrNom = createString("adrNom");

    public final StringPath fouCode = createString("fouCode");

    public final StringPath fouNom = createString("fouNom");

    public final NumberPath<Long> fouOrdre = createNumber("fouOrdre", Long.class);

    public final StringPath fouValide = createString("fouValide");

    public QDepVFournisseurSansAdr(String variable) {
        super(QDepVFournisseurSansAdr.class, forVariable(variable), "GFC", "DEP_V_FOURNISSEUR_SANS_ADR");
        addMetadata();
    }

    public QDepVFournisseurSansAdr(String variable, String schema, String table) {
        super(QDepVFournisseurSansAdr.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDepVFournisseurSansAdr(Path<? extends QDepVFournisseurSansAdr> path) {
        super(path.getType(), path.getMetadata(), "GFC", "DEP_V_FOURNISSEUR_SANS_ADR");
        addMetadata();
    }

    public QDepVFournisseurSansAdr(PathMetadata metadata) {
        super(QDepVFournisseurSansAdr.class, metadata, "GFC", "DEP_V_FOURNISSEUR_SANS_ADR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrNom, ColumnMetadata.named("ADR_NOM").withIndex(5).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(fouCode, ColumnMetadata.named("FOU_CODE").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(fouNom, ColumnMetadata.named("FOU_NOM").withIndex(3).ofType(Types.VARCHAR).withSize(241));
        addMetadata(fouOrdre, ColumnMetadata.named("FOU_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(fouValide, ColumnMetadata.named("FOU_VALIDE").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


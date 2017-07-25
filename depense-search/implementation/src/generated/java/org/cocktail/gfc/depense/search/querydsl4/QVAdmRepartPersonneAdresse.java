package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmRepartPersonneAdresse is a Querydsl query type for QVAdmRepartPersonneAdresse
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmRepartPersonneAdresse extends com.querydsl.sql.RelationalPathBase<QVAdmRepartPersonneAdresse> {

    private static final long serialVersionUID = 1197849919;

    public static final QVAdmRepartPersonneAdresse vAdmRepartPersonneAdresse = new QVAdmRepartPersonneAdresse("V_ADM_REPART_PERSONNE_ADRESSE");

    public final NumberPath<Long> adrOrdre = createNumber("adrOrdre", Long.class);

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final StringPath eMail = createString("eMail");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath rpaPrincipal = createString("rpaPrincipal");

    public final StringPath rpaValide = createString("rpaValide");

    public final StringPath tadrCode = createString("tadrCode");

    public QVAdmRepartPersonneAdresse(String variable) {
        super(QVAdmRepartPersonneAdresse.class, forVariable(variable), "GFC", "V_ADM_REPART_PERSONNE_ADRESSE");
        addMetadata();
    }

    public QVAdmRepartPersonneAdresse(String variable, String schema, String table) {
        super(QVAdmRepartPersonneAdresse.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmRepartPersonneAdresse(Path<? extends QVAdmRepartPersonneAdresse> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_REPART_PERSONNE_ADRESSE");
        addMetadata();
    }

    public QVAdmRepartPersonneAdresse(PathMetadata metadata) {
        super(QVAdmRepartPersonneAdresse.class, metadata, "GFC", "V_ADM_REPART_PERSONNE_ADRESSE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adrOrdre, ColumnMetadata.named("ADR_ORDRE").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(8).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(eMail, ColumnMetadata.named("E_MAIL").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(rpaPrincipal, ColumnMetadata.named("RPA_PRINCIPAL").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(rpaValide, ColumnMetadata.named("RPA_VALIDE").withIndex(5).ofType(Types.VARCHAR).withSize(1));
        addMetadata(tadrCode, ColumnMetadata.named("TADR_CODE").withIndex(6).ofType(Types.VARCHAR).withSize(5).notNull());
    }

}


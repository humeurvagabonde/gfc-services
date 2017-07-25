package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmOrigRecDescendance is a Querydsl query type for QVAdmOrigRecDescendance
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmOrigRecDescendance extends com.querydsl.sql.RelationalPathBase<QVAdmOrigRecDescendance> {

    private static final long serialVersionUID = -1867762008;

    public static final QVAdmOrigRecDescendance vAdmOrigRecDescendance = new QVAdmOrigRecDescendance("V_ADM_ORIG_REC_DESCENDANCE");

    public final NumberPath<Long> idAdmOrigRecAncetre = createNumber("idAdmOrigRecAncetre", Long.class);

    public final NumberPath<Long> idAdmOrigRecDescendant = createNumber("idAdmOrigRecDescendant", Long.class);

    public final NumberPath<Long> niveauAncetre = createNumber("niveauAncetre", Long.class);

    public QVAdmOrigRecDescendance(String variable) {
        super(QVAdmOrigRecDescendance.class, forVariable(variable), "GFC", "V_ADM_ORIG_REC_DESCENDANCE");
        addMetadata();
    }

    public QVAdmOrigRecDescendance(String variable, String schema, String table) {
        super(QVAdmOrigRecDescendance.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmOrigRecDescendance(Path<? extends QVAdmOrigRecDescendance> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_ORIG_REC_DESCENDANCE");
        addMetadata();
    }

    public QVAdmOrigRecDescendance(PathMetadata metadata) {
        super(QVAdmOrigRecDescendance.class, metadata, "GFC", "V_ADM_ORIG_REC_DESCENDANCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmOrigRecAncetre, ColumnMetadata.named("ID_ADM_ORIG_REC_ANCETRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmOrigRecDescendant, ColumnMetadata.named("ID_ADM_ORIG_REC_DESCENDANT").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(niveauAncetre, ColumnMetadata.named("NIVEAU_ANCETRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


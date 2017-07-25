package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmDestDepDescendance is a Querydsl query type for QVAdmDestDepDescendance
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmDestDepDescendance extends com.querydsl.sql.RelationalPathBase<QVAdmDestDepDescendance> {

    private static final long serialVersionUID = 1870833770;

    public static final QVAdmDestDepDescendance vAdmDestDepDescendance = new QVAdmDestDepDescendance("V_ADM_DEST_DEP_DESCENDANCE");

    public final NumberPath<Long> idAdmDestDepAncetre = createNumber("idAdmDestDepAncetre", Long.class);

    public final NumberPath<Long> idAdmDestDepDescendant = createNumber("idAdmDestDepDescendant", Long.class);

    public final NumberPath<Long> niveauAncetre = createNumber("niveauAncetre", Long.class);

    public QVAdmDestDepDescendance(String variable) {
        super(QVAdmDestDepDescendance.class, forVariable(variable), "GFC", "V_ADM_DEST_DEP_DESCENDANCE");
        addMetadata();
    }

    public QVAdmDestDepDescendance(String variable, String schema, String table) {
        super(QVAdmDestDepDescendance.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmDestDepDescendance(Path<? extends QVAdmDestDepDescendance> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_DEST_DEP_DESCENDANCE");
        addMetadata();
    }

    public QVAdmDestDepDescendance(PathMetadata metadata) {
        super(QVAdmDestDepDescendance.class, metadata, "GFC", "V_ADM_DEST_DEP_DESCENDANCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmDestDepAncetre, ColumnMetadata.named("ID_ADM_DEST_DEP_ANCETRE").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(idAdmDestDepDescendant, ColumnMetadata.named("ID_ADM_DEST_DEP_DESCENDANT").withIndex(3).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(niveauAncetre, ColumnMetadata.named("NIVEAU_ANCETRE").withIndex(2).ofType(Types.DECIMAL).withSize(0));
    }

}


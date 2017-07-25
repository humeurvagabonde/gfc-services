package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmEbDescendance is a Querydsl query type for QVAdmEbDescendance
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmEbDescendance extends com.querydsl.sql.RelationalPathBase<QVAdmEbDescendance> {

    private static final long serialVersionUID = -1995571810;

    public static final QVAdmEbDescendance vAdmEbDescendance = new QVAdmEbDescendance("V_ADM_EB_DESCENDANCE");

    public final NumberPath<Long> idAdmEbAncetre = createNumber("idAdmEbAncetre", Long.class);

    public final NumberPath<Long> idAdmEbDescendant = createNumber("idAdmEbDescendant", Long.class);

    public QVAdmEbDescendance(String variable) {
        super(QVAdmEbDescendance.class, forVariable(variable), "GFC", "V_ADM_EB_DESCENDANCE");
        addMetadata();
    }

    public QVAdmEbDescendance(String variable, String schema, String table) {
        super(QVAdmEbDescendance.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmEbDescendance(Path<? extends QVAdmEbDescendance> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_EB_DESCENDANCE");
        addMetadata();
    }

    public QVAdmEbDescendance(PathMetadata metadata) {
        super(QVAdmEbDescendance.class, metadata, "GFC", "V_ADM_EB_DESCENDANCE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idAdmEbAncetre, ColumnMetadata.named("ID_ADM_EB_ANCETRE").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmEbDescendant, ColumnMetadata.named("ID_ADM_EB_DESCENDANT").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


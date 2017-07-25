package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmStructureGroupe is a Querydsl query type for QVAdmStructureGroupe
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmStructureGroupe extends com.querydsl.sql.RelationalPathBase<QVAdmStructureGroupe> {

    private static final long serialVersionUID = 1995038235;

    public static final QVAdmStructureGroupe vAdmStructureGroupe = new QVAdmStructureGroupe("V_ADM_STRUCTURE_GROUPE");

    public final StringPath cStructure = createString("cStructure");

    public final StringPath cStructurePere = createString("cStructurePere");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final StringPath grpAcces = createString("grpAcces");

    public final StringPath grpAlias = createString("grpAlias");

    public final NumberPath<Long> grpOwner = createNumber("grpOwner", Long.class);

    public final NumberPath<Long> grpResponsable = createNumber("grpResponsable", Long.class);

    public final StringPath lcStructure = createString("lcStructure");

    public final StringPath llStructure = createString("llStructure");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath strActivite = createString("strActivite");

    public final StringPath strOrigine = createString("strOrigine");

    public QVAdmStructureGroupe(String variable) {
        super(QVAdmStructureGroupe.class, forVariable(variable), "GFC", "V_ADM_STRUCTURE_GROUPE");
        addMetadata();
    }

    public QVAdmStructureGroupe(String variable, String schema, String table) {
        super(QVAdmStructureGroupe.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmStructureGroupe(Path<? extends QVAdmStructureGroupe> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_STRUCTURE_GROUPE");
        addMetadata();
    }

    public QVAdmStructureGroupe(PathMetadata metadata) {
        super(QVAdmStructureGroupe.class, metadata, "GFC", "V_ADM_STRUCTURE_GROUPE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(cStructurePere, ColumnMetadata.named("C_STRUCTURE_PERE").withIndex(5).ofType(Types.VARCHAR).withSize(10));
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(12).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(13).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(grpAcces, ColumnMetadata.named("GRP_ACCES").withIndex(10).ofType(Types.VARCHAR).withSize(1));
        addMetadata(grpAlias, ColumnMetadata.named("GRP_ALIAS").withIndex(11).ofType(Types.VARCHAR).withSize(200));
        addMetadata(grpOwner, ColumnMetadata.named("GRP_OWNER").withIndex(8).ofType(Types.DECIMAL).withSize(0));
        addMetadata(grpResponsable, ColumnMetadata.named("GRP_RESPONSABLE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(lcStructure, ColumnMetadata.named("LC_STRUCTURE").withIndex(4).ofType(Types.VARCHAR).withSize(30));
        addMetadata(llStructure, ColumnMetadata.named("LL_STRUCTURE").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(strActivite, ColumnMetadata.named("STR_ACTIVITE").withIndex(7).ofType(Types.VARCHAR).withSize(80));
        addMetadata(strOrigine, ColumnMetadata.named("STR_ORIGINE").withIndex(6).ofType(Types.VARCHAR).withSize(80));
    }

}


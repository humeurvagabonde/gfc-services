package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmStructureUlr is a Querydsl query type for QVAdmStructureUlr
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmStructureUlr extends com.querydsl.sql.RelationalPathBase<QVAdmStructureUlr> {

    private static final long serialVersionUID = -955045754;

    public static final QVAdmStructureUlr vAdmStructureUlr = new QVAdmStructureUlr("V_ADM_STRUCTURE_ULR");

    public final StringPath cStructure = createString("cStructure");

    public final StringPath cStructurePere = createString("cStructurePere");

    public final StringPath cTypeEtablissemen = createString("cTypeEtablissemen");

    public final StringPath cTypeStructure = createString("cTypeStructure");

    public final NumberPath<Long> grpResponsable = createNumber("grpResponsable", Long.class);

    public final StringPath lcStructure = createString("lcStructure");

    public final StringPath llStructure = createString("llStructure");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public final StringPath temValide = createString("temValide");

    public QVAdmStructureUlr(String variable) {
        super(QVAdmStructureUlr.class, forVariable(variable), "GFC", "V_ADM_STRUCTURE_ULR");
        addMetadata();
    }

    public QVAdmStructureUlr(String variable, String schema, String table) {
        super(QVAdmStructureUlr.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmStructureUlr(Path<? extends QVAdmStructureUlr> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_STRUCTURE_ULR");
        addMetadata();
    }

    public QVAdmStructureUlr(PathMetadata metadata) {
        super(QVAdmStructureUlr.class, metadata, "GFC", "V_ADM_STRUCTURE_ULR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cStructure, ColumnMetadata.named("C_STRUCTURE").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(cStructurePere, ColumnMetadata.named("C_STRUCTURE_PERE").withIndex(6).ofType(Types.VARCHAR).withSize(10));
        addMetadata(cTypeEtablissemen, ColumnMetadata.named("C_TYPE_ETABLISSEMEN").withIndex(7).ofType(Types.VARCHAR).withSize(5));
        addMetadata(cTypeStructure, ColumnMetadata.named("C_TYPE_STRUCTURE").withIndex(5).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(grpResponsable, ColumnMetadata.named("GRP_RESPONSABLE").withIndex(9).ofType(Types.DECIMAL).withSize(0));
        addMetadata(lcStructure, ColumnMetadata.named("LC_STRUCTURE").withIndex(4).ofType(Types.VARCHAR).withSize(30));
        addMetadata(llStructure, ColumnMetadata.named("LL_STRUCTURE").withIndex(3).ofType(Types.VARCHAR).withSize(200));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(2).ofType(Types.DECIMAL).withSize(0).notNull());
        addMetadata(temValide, ColumnMetadata.named("TEM_VALIDE").withIndex(8).ofType(Types.VARCHAR).withSize(1).notNull());
    }

}


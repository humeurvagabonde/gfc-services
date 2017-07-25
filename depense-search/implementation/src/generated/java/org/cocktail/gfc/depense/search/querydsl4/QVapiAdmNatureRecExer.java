package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVapiAdmNatureRecExer is a Querydsl query type for QVapiAdmNatureRecExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVapiAdmNatureRecExer extends com.querydsl.sql.RelationalPathBase<QVapiAdmNatureRecExer> {

    private static final long serialVersionUID = -165837075;

    public static final QVapiAdmNatureRecExer vapiAdmNatureRecExer = new QVapiAdmNatureRecExer("VAPI_ADM_NATURE_REC_EXER");

    public final StringPath code = createString("code");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmNatureRec = createNumber("idAdmNatureRec", Long.class);

    public final StringPath libelle = createString("libelle");

    public final StringPath type = createString("type");

    public QVapiAdmNatureRecExer(String variable) {
        super(QVapiAdmNatureRecExer.class, forVariable(variable), "GFC", "VAPI_ADM_NATURE_REC_EXER");
        addMetadata();
    }

    public QVapiAdmNatureRecExer(String variable, String schema, String table) {
        super(QVapiAdmNatureRecExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVapiAdmNatureRecExer(Path<? extends QVapiAdmNatureRecExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "VAPI_ADM_NATURE_REC_EXER");
        addMetadata();
    }

    public QVapiAdmNatureRecExer(PathMetadata metadata) {
        super(QVapiAdmNatureRecExer.class, metadata, "GFC", "VAPI_ADM_NATURE_REC_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(code, ColumnMetadata.named("CODE").withIndex(3).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmNatureRec, ColumnMetadata.named("ID_ADM_NATURE_REC").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(libelle, ColumnMetadata.named("LIBELLE").withIndex(4).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(type, ColumnMetadata.named("TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}


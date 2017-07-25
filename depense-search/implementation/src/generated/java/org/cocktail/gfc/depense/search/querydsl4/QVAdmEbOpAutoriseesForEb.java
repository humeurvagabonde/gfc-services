package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmEbOpAutoriseesForEb is a Querydsl query type for QVAdmEbOpAutoriseesForEb
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmEbOpAutoriseesForEb extends com.querydsl.sql.RelationalPathBase<QVAdmEbOpAutoriseesForEb> {

    private static final long serialVersionUID = -1126952956;

    public static final QVAdmEbOpAutoriseesForEb vAdmEbOpAutoriseesForEb = new QVAdmEbOpAutoriseesForEb("V_ADM_EB_OP_AUTORISEES_FOR_EB");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmEb = createNumber("idAdmEb", Long.class);

    public final NumberPath<Long> opAutorisees = createNumber("opAutorisees", Long.class);

    public QVAdmEbOpAutoriseesForEb(String variable) {
        super(QVAdmEbOpAutoriseesForEb.class, forVariable(variable), "GFC", "V_ADM_EB_OP_AUTORISEES_FOR_EB");
        addMetadata();
    }

    public QVAdmEbOpAutoriseesForEb(String variable, String schema, String table) {
        super(QVAdmEbOpAutoriseesForEb.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmEbOpAutoriseesForEb(Path<? extends QVAdmEbOpAutoriseesForEb> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_EB_OP_AUTORISEES_FOR_EB");
        addMetadata();
    }

    public QVAdmEbOpAutoriseesForEb(PathMetadata metadata) {
        super(QVAdmEbOpAutoriseesForEb.class, metadata, "GFC", "V_ADM_EB_OP_AUTORISEES_FOR_EB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(1).ofType(Types.DECIMAL).withSize(4));
        addMetadata(idAdmEb, ColumnMetadata.named("ID_ADM_EB").withIndex(2).ofType(Types.DECIMAL).withSize(38));
        addMetadata(opAutorisees, ColumnMetadata.named("OP_AUTORISEES").withIndex(3).ofType(Types.DECIMAL).withSize(0));
    }

}


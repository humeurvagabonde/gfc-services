package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVCptDcrObjetACorriger is a Querydsl query type for QVCptDcrObjetACorriger
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVCptDcrObjetACorriger extends com.querydsl.sql.RelationalPathBase<QVCptDcrObjetACorriger> {

    private static final long serialVersionUID = 1200024074;

    public static final QVCptDcrObjetACorriger vCptDcrObjetACorriger = new QVCptDcrObjetACorriger("V_CPT_DCR_OBJET_A_CORRIGER");

    public final NumberPath<Long> idObj = createNumber("idObj", Long.class);

    public final StringPath numObj = createString("numObj");

    public final StringPath typeObj = createString("typeObj");

    public QVCptDcrObjetACorriger(String variable) {
        super(QVCptDcrObjetACorriger.class, forVariable(variable), "GFC", "V_CPT_DCR_OBJET_A_CORRIGER");
        addMetadata();
    }

    public QVCptDcrObjetACorriger(String variable, String schema, String table) {
        super(QVCptDcrObjetACorriger.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVCptDcrObjetACorriger(Path<? extends QVCptDcrObjetACorriger> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_CPT_DCR_OBJET_A_CORRIGER");
        addMetadata();
    }

    public QVCptDcrObjetACorriger(PathMetadata metadata) {
        super(QVCptDcrObjetACorriger.class, metadata, "GFC", "V_CPT_DCR_OBJET_A_CORRIGER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(idObj, ColumnMetadata.named("ID_OBJ").withIndex(1).ofType(Types.DECIMAL).withSize(0));
        addMetadata(numObj, ColumnMetadata.named("NUM_OBJ").withIndex(2).ofType(Types.VARCHAR).withSize(50));
        addMetadata(typeObj, ColumnMetadata.named("TYPE_OBJ").withIndex(3).ofType(Types.VARCHAR).withSize(50));
    }

}


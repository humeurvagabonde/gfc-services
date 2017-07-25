package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVAdmPays is a Querydsl query type for QVAdmPays
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVAdmPays extends com.querydsl.sql.RelationalPathBase<QVAdmPays> {

    private static final long serialVersionUID = -1228446455;

    public static final QVAdmPays vAdmPays = new QVAdmPays("V_ADM_PAYS");

    public final StringPath codeIso = createString("codeIso");

    public final StringPath cPays = createString("cPays");

    public final DateTimePath<java.sql.Timestamp> dCreation = createDateTime("dCreation", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dDebVal = createDateTime("dDebVal", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dFinVal = createDateTime("dFinVal", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dModification = createDateTime("dModification", java.sql.Timestamp.class);

    public final StringPath lcPays = createString("lcPays");

    public final StringPath llPays = createString("llPays");

    public final StringPath lNationalite = createString("lNationalite");

    public QVAdmPays(String variable) {
        super(QVAdmPays.class, forVariable(variable), "GFC", "V_ADM_PAYS");
        addMetadata();
    }

    public QVAdmPays(String variable, String schema, String table) {
        super(QVAdmPays.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVAdmPays(Path<? extends QVAdmPays> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_ADM_PAYS");
        addMetadata();
    }

    public QVAdmPays(PathMetadata metadata) {
        super(QVAdmPays.class, metadata, "GFC", "V_ADM_PAYS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(codeIso, ColumnMetadata.named("CODE_ISO").withIndex(9).ofType(Types.VARCHAR).withSize(2));
        addMetadata(cPays, ColumnMetadata.named("C_PAYS").withIndex(1).ofType(Types.VARCHAR).withSize(3).notNull());
        addMetadata(dCreation, ColumnMetadata.named("D_CREATION").withIndex(7).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(dDebVal, ColumnMetadata.named("D_DEB_VAL").withIndex(5).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dFinVal, ColumnMetadata.named("D_FIN_VAL").withIndex(6).ofType(Types.TIMESTAMP).withSize(7));
        addMetadata(dModification, ColumnMetadata.named("D_MODIFICATION").withIndex(8).ofType(Types.TIMESTAMP).withSize(7).notNull());
        addMetadata(lcPays, ColumnMetadata.named("LC_PAYS").withIndex(3).ofType(Types.VARCHAR).withSize(20));
        addMetadata(llPays, ColumnMetadata.named("LL_PAYS").withIndex(2).ofType(Types.VARCHAR).withSize(40));
        addMetadata(lNationalite, ColumnMetadata.named("L_NATIONALITE").withIndex(4).ofType(Types.VARCHAR).withSize(20));
    }

}


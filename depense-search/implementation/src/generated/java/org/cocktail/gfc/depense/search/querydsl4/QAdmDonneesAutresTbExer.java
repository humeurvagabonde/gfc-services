package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAdmDonneesAutresTbExer is a Querydsl query type for QAdmDonneesAutresTbExer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAdmDonneesAutresTbExer extends com.querydsl.sql.RelationalPathBase<QAdmDonneesAutresTbExer> {

    private static final long serialVersionUID = 90586614;

    public static final QAdmDonneesAutresTbExer admDonneesAutresTbExer = new QAdmDonneesAutresTbExer("ADM_DONNEES_AUTRES_TB_EXER");

    public final StringPath active = createString("active");

    public final NumberPath<Integer> exeOrdre = createNumber("exeOrdre", Integer.class);

    public final NumberPath<Long> idAdmDonneesAutresTb = createNumber("idAdmDonneesAutresTb", Long.class);

    public final NumberPath<Long> idAdmDonneesAutresTbExer = createNumber("idAdmDonneesAutresTbExer", Long.class);

    public QAdmDonneesAutresTbExer(String variable) {
        super(QAdmDonneesAutresTbExer.class, forVariable(variable), "GFC", "ADM_DONNEES_AUTRES_TB_EXER");
        addMetadata();
    }

    public QAdmDonneesAutresTbExer(String variable, String schema, String table) {
        super(QAdmDonneesAutresTbExer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAdmDonneesAutresTbExer(Path<? extends QAdmDonneesAutresTbExer> path) {
        super(path.getType(), path.getMetadata(), "GFC", "ADM_DONNEES_AUTRES_TB_EXER");
        addMetadata();
    }

    public QAdmDonneesAutresTbExer(PathMetadata metadata) {
        super(QAdmDonneesAutresTbExer.class, metadata, "GFC", "ADM_DONNEES_AUTRES_TB_EXER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("ACTIVE").withIndex(4).ofType(Types.VARCHAR).withSize(1).notNull());
        addMetadata(exeOrdre, ColumnMetadata.named("EXE_ORDRE").withIndex(3).ofType(Types.DECIMAL).withSize(4).notNull());
        addMetadata(idAdmDonneesAutresTb, ColumnMetadata.named("ID_ADM_DONNEES_AUTRES_TB").withIndex(2).ofType(Types.DECIMAL).withSize(38).notNull());
        addMetadata(idAdmDonneesAutresTbExer, ColumnMetadata.named("ID_ADM_DONNEES_AUTRES_TB_EXER").withIndex(1).ofType(Types.DECIMAL).withSize(38).notNull());
    }

}


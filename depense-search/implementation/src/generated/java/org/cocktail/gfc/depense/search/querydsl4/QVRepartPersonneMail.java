package org.cocktail.gfc.depense.search.querydsl4;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QVRepartPersonneMail is a Querydsl query type for QVRepartPersonneMail
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QVRepartPersonneMail extends com.querydsl.sql.RelationalPathBase<QVRepartPersonneMail> {

    private static final long serialVersionUID = 1602158197;

    public static final QVRepartPersonneMail vRepartPersonneMail = new QVRepartPersonneMail("V_REPART_PERSONNE_MAIL");

    public final StringPath email = createString("email");

    public final NumberPath<Long> persId = createNumber("persId", Long.class);

    public QVRepartPersonneMail(String variable) {
        super(QVRepartPersonneMail.class, forVariable(variable), "GFC", "V_REPART_PERSONNE_MAIL");
        addMetadata();
    }

    public QVRepartPersonneMail(String variable, String schema, String table) {
        super(QVRepartPersonneMail.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QVRepartPersonneMail(Path<? extends QVRepartPersonneMail> path) {
        super(path.getType(), path.getMetadata(), "GFC", "V_REPART_PERSONNE_MAIL");
        addMetadata();
    }

    public QVRepartPersonneMail(PathMetadata metadata) {
        super(QVRepartPersonneMail.class, metadata, "GFC", "V_REPART_PERSONNE_MAIL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(email, ColumnMetadata.named("EMAIL").withIndex(2).ofType(Types.VARCHAR).withSize(101));
        addMetadata(persId, ColumnMetadata.named("PERS_ID").withIndex(1).ofType(Types.DECIMAL).withSize(0).notNull());
    }

}


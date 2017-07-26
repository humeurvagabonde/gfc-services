package org.cocktail.gfc.depense.metier.modele.sf

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Table
import javax.persistence.Column

@Entity
@Table(name = "ADM_CODE_ANALYTIQUE", schema = "GFC")
class CodeAnalytique(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CAN_ID")
    var id: Long?,
    @Column(name = "CAN_CODE")
	var code: String = "",
	@Column(name = "CAN_LIBELLE")
	var libelle: String = ""
)

/*
 		package org.cocktail.gfc.admin.nomenclature.support.querydsl;

import static org.cocktail.gfc.support.querydsl4.QAdmCodeAnalytique.admCodeAnalytique;
import static org.cocktail.gfc.support.querydsl4.QAdmCodeAnalytiqueEb.admCodeAnalytiqueEb;
import static org.cocktail.gfc.support.querydsl4.QAdmUtilisateur.admUtilisateur;
import static org.cocktail.gfc.support.querydsl4.QAdmUtilisateurEb.admUtilisateurEb;
import static org.cocktail.gfc.support.querydsl4.QDepEj.depEj;
import static org.cocktail.gfc.support.querydsl4.QDepEjLigne.depEjLigne;
import static org.cocktail.gfc.support.querydsl4.QDepRepartBudget.depRepartBudget;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.cocktail.gfc.admin.nomenclature.codeanalytique.CodeAnalytique;
import org.cocktail.gfc.admin.nomenclature.support.CodeAnalytiqueRepository;
import org.cocktail.gfc.common.beans.date.CktlGFCDate;
import org.cocktail.gfc.common.enums.admin.TypeEtat;
import org.cocktail.gfc.common.querydsl.SequenceRepository4;
import org.cocktail.gfc.metadata.id.admin.nomenclature.CodeAnalytiqueId;
import org.cocktail.gfc.metadata.id.depense.EjId;
import org.cocktail.gfc.metadata.id.referentiel.PersonneId;

import com.querydsl.core.Tuple;
import com.querydsl.core.types.MappingProjection;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.sql.SQLQueryFactory;

@Named
@Singleton
public class QueryDSLCodeAnalytiqueRepository extends SequenceRepository4 implements CodeAnalytiqueRepository {

    @Inject
    private SQLQueryFactory qf;
    private final Projection projection = new Projection();

    @Override
    public List<CodeAnalytique> findAll() {
        return qf.select(projection)
                .from(admCodeAnalytique)
                .fetch();
    }

    @Override
    public List<CodeAnalytique> findOuvertsEtPourPersId(EjId ejId, CktlGFCDate dateEj, PersonneId personneId) {
        return qf.select(projection)
                .from(admCodeAnalytique)
                .where(isOuvert(dateEj)
                        .and(isValide())
                        .and(isPublic().or(isLieAEbAuthorisee(personneId, ejId))))
                .orderBy(admCodeAnalytique.canLibelle.asc())
                .fetch();
    }

    private BooleanExpression isValide() {
        return admCodeAnalytique.canUtilisable.eq(TypeEtat.OUI.getId())
                .and(admCodeAnalytique.tyetId.eq(TypeEtat.VALIDE.getId()));
    }

    private BooleanExpression isOuvert(CktlGFCDate date) {
        return admCodeAnalytique.canOuverture.loe(date.toTimeStamp())
                .and(admCodeAnalytique.canFermeture.goe(date.toTimeStamp())
                        .or(admCodeAnalytique.canFermeture.isNull()));
    }

    private BooleanExpression isPublic() {
        return admCodeAnalytique.canPublic.eq(TypeEtat.OUI.getId());
    }

    private BooleanExpression isLieAEbAuthorisee(PersonneId personneId, EjId ejId) {
        return isUserAutoriseSurEbLieeACodeAnalytique(personneId).and(isRepartEjSurEbLieeACodeAnalytique(ejId));
    }

    private BooleanExpression isUserAutoriseSurEbLieeACodeAnalytique(PersonneId personneId) {
        return qf.from(admUtilisateurEb)
                .join(admUtilisateur).on(admUtilisateur.utlOrdre.eq(admUtilisateurEb.utlOrdre))
                .join(admCodeAnalytiqueEb).on(admCodeAnalytiqueEb.idAdmEb.eq(admUtilisateurEb.idAdmEb))
                .where(admUtilisateur.persId.eq(personneId.getId())
                        .and(admUtilisateurEb.exeOrdre.eq(CktlGFCDate.now().getDate().getYear()))
                        .and(admCodeAnalytiqueEb.canId.eq(admCodeAnalytique.canId)))
                .exists();
    }

    private BooleanExpression isRepartEjSurEbLieeACodeAnalytique(EjId ejId) {
        return qf.from(depEj)
                .join(depEjLigne).on(depEjLigne.idDepEj.eq(depEj.idDepEj))
                .join(depRepartBudget).on(depRepartBudget.idDepEjLigne.eq(depEjLigne.idDepEjLigne))
                .join(admCodeAnalytiqueEb).on(admCodeAnalytiqueEb.idAdmEb.eq(depRepartBudget.idAdmEb))
                .where(depEj.idDepEj.eq(ejId.getId())
                        .and(admCodeAnalytiqueEb.canId.eq(admCodeAnalytique.canId)))
                .exists();
    }

    public class Projection extends MappingProjection<CodeAnalytique> {

        private static final long serialVersionUID = 1L;

        public Projection() {
            super(CodeAnalytique.class, admCodeAnalytique.all());
        }

        @Override
        protected CodeAnalytique map(Tuple row) {
            return CodeAnalytique.builder()
                    .id(new CodeAnalytiqueId(row.get(admCodeAnalytique.canId)))
                    .code(row.get(admCodeAnalytique.canCode))
                    .libelle(row.get(admCodeAnalytique.canLibelle))
                    .build();
        }

    }
}
 		*/
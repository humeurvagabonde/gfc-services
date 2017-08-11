package org.cocktail.gfc.depense.financement.port.adapater.persistence;

import org.cocktail.gfc.common.bean.montant.Montant;
import org.cocktail.gfc.depense.financement.metier.modele.dp.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// IDEES
// On pourra p.e injecter un CrudRepository Spring pour enlever le code JPA
// Utiliser mapstruct jpa <-> entite metier

@Named
@Singleton
public final class JpaFinancementDemandePaiementRepository implements FinancementDemandePaiementRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(JpaFinancementDemandePaiementRepository.class);

    @PersistenceContext
    private EntityManager em;

    private final JpaOperationsDelegate delegate = new JpaOperationsDelegate();

    @Override
    public FinancementDemandePaiement save(FinancementDemandePaiement financementDp) {


        // TODO ajouter toute la logique de Mapping
        // puis save em
//        if (financementDp. == null) {
//            em.persist(account);
//            return account;
//        } else {
//            return em.merge(account);
//        }
        return null;
    }

    @Override
    public FinancementDemandePaiement findOne(Long idDp) {
        JpaFinancementDp jpaFinancementDp = delegate.findOne(idDp);
        FinancementDemandePaiement financementDp = new FinancementDemandePaiement(jpaFinancementDp.getIdDp(), jpaFinancementDp.getNumeroDp());
        Map<Long, FinancementBienDp> financementsParBien = jpaFinancementDp.getDpLignes().stream()
                .map(this::mapFinancementBien)
                .collect(Collectors.toMap(FinancementBienDp::getIdBien, Function.identity()));
        financementDp.getFinancementParBien().putAll(financementsParBien);
        return financementDp;
    }

    @Override
    public void delete(FinancementDemandePaiement financementDp) {

    }

    private FinancementBienDp mapFinancementBien(JpaFinancementDpLigne jpaFinancementDpLigne) {
        BienAPayer bien = new BienAPayer(jpaFinancementDpLigne.getIdDpLigne(), new Montant(jpaFinancementDpLigne.getMontantHT()));
        FinancementBienDp financementBien = new FinancementBienDp(bien);
        List<RepartitionComptaBud> repartsBud = jpaFinancementDpLigne.getDpLignes().stream()
                .map(this::mapRepartBud)
                .collect(Collectors.toList());
        financementBien.getRepartitionsComptaBud().addAll(repartsBud);

        List<RepartitionComptaGene> repartsGene = jpaFinancementDpLigne.getDpLignes().stream()
                .map(this::mapRepartGene)
                .collect(Collectors.toList());
        financementBien.getRepartitionsComptaGene().addAll(repartsGene);

        return financementBien;
    }

    private RepartitionComptaBud mapRepartBud(JpaFinancementDpLigneRepartition jpaRepart) {
        RepartitionComptaBud repart = new RepartitionComptaBud(jpaRepart.getIdDpLigneRepart());
        return repart;
    }

    private RepartitionComptaGene mapRepartGene(JpaFinancementDpLigneRepartition jpaRepart) {
        RepartitionComptaGene repart = new RepartitionComptaGene(jpaRepart.getIdDpLigneRepart());
        return repart;
    }

    private class JpaOperationsDelegate {
        public JpaFinancementDp findOne(Long idDp) {
            JpaFinancementDp jpaDp = em.find(JpaFinancementDp.class, idDp);
            LOGGER.debug(jpaDp.toString());
            return jpaDp;
        }

        public JpaFinancementDp save() {
            return null;
        }

        public void delete() {

        }
    }
}



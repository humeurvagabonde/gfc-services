package org.cocktail.gfc.depense.comptabilite.application;

import org.cocktail.gfc.comptabilite.generale.api.ComptaGeneraleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.transaction.Transactional;

// TODO cette AppService semble fonctionner comme une SAGA (ordonnance les appels entre depense et les différentes comptas). Si c'est bien le cas il devrait plutot generer des Commands aupres de la compta generale et compta budgetaire
// TODO définir le format des données en entrée sous forme de Command (pour Brouillard, pour Ecriture)
@Named
@Singleton
@Transactional
public class RapprochementDpEnComptaApplicationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RapprochementDpEnComptaApplicationService.class);

    @Inject
    private ComptaGeneraleService comptaGeneSrv;

    @Inject
    private ApplicationEventPublisher publisher;

    public void creerRapprochementDpEnComptabiliteGenerale() {
        LOGGER.debug("creerRapprochementDpEnComptabiliteGenerale");

        // parcourir les infos en entree
        // faire appel a un service de conversion EB <-> CODE GESTION

        // appeler la compta generale
        comptaGeneSrv.creerBrouillard();
    }

    public void creerRapprochementDpEntreComptaGeneetBudgetaire() {
        LOGGER.debug("creerRapprochementDpEntreComptaGeneetBudgetaire");
        // enregistrer les enregistrements dans la table

    }

    public void creerRapprochementDpEnComptabiliteBudgetaire() {
        LOGGER.debug("creerRapprochementDpEnComptabiliteBudgetaire");

        // parcourir les infos budgetaires
        // et regenerer un evenement pour consommation budgetaire si besoin (dans le cas des DP-DIRECTE)

    }

}

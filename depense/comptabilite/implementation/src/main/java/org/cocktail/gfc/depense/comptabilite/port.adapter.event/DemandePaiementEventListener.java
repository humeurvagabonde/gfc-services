package org.cocktail.gfc.depense.comptabilite.port.adapter.event;

import org.cocktail.gfc.comptabilite.generale.api.BrouillardCreeEvent;
import org.cocktail.gfc.depense.api.DemandePaiementValideeEvent;
import org.cocktail.gfc.depense.comptabilite.application.RapprochementDpEnComptaApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

// TODO handleDpValideeEvent : un seul point creerRapprochementDpEnComptabilite ou plusieurs comme actuellement ?
@Named
@Singleton
public class DemandePaiementEventListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemandePaiementEventListener.class);

    @Inject
    private RapprochementDpEnComptaApplicationService rapprochementDpAppSrv;

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void handleDpValideeEvent(DemandePaiementValideeEvent event) {
        LOGGER.debug(String.format("%s Validee le %s",event.getNumDp(), event.getTimestamp()));

        rapprochementDpAppSrv.creerRapprochementDpEnComptabiliteBudgetaire();
        rapprochementDpAppSrv.creerRapprochementDpEnComptabiliteGenerale();

    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION)
    public void handleBrouillardCreeEvent(BrouillardCreeEvent event) {
        LOGGER.debug(String.format("Brouillard %s genere le %s", event.getIdBrouillard(), event.getTimestamp()));

        rapprochementDpAppSrv.creerRapprochementDpEntreComptaGeneetBudgetaire();
    }

}

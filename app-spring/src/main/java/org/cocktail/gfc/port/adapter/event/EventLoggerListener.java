package org.cocktail.gfc.port.adapter.event;

import javax.inject.Named;
import javax.inject.Singleton;

import org.cocktail.gfc.comptabilite.generale.api.HelloComptaGeneraleSentEvent;
import org.cocktail.gfc.depense.api.DemandePaiementValideeEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.event.TransactionalEventListener;

@Named
@Singleton
public class EventLoggerListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventLoggerListener.class);

    @TransactionalEventListener
    public void handleHelloGeneEvent(HelloComptaGeneraleSentEvent event) {
        LOGGER.debug(">>> Audit : Nouvel hello " + event.getTimestamp());
    }

    @TransactionalEventListener
    public void handleDpValideeEvent(DemandePaiementValideeEvent event) {
        LOGGER.debug(">>> Audit : Nouvelle DP validee " + event.getTimestamp());
    }
    
}

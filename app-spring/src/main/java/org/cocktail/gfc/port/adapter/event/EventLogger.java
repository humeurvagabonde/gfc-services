package org.cocktail.gfc.port.adapter.event;

import javax.inject.Named;
import javax.inject.Singleton;

import org.cocktail.gfc.comptabilite.generale.api.HelloComptaGeneraleSentEvent;
import org.springframework.context.event.EventListener;

@Named
@Singleton
public class EventLogger {

    @EventListener // ou TransactionalEventListener
    public void handleContextRefresh(HelloComptaGeneraleSentEvent event) {
        System.err.println(">>> Nouvel hello " + event.getTimestamp());
    }
    
}

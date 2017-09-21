package org.cocktail.gfc.comptabilite.generale.application.hello;

import org.cocktail.gfc.comptabilite.budgetaire.api.HelloBudgetaireService;
import org.cocktail.gfc.comptabilite.generale.api.HelloComptaGeneraleSentEvent;
import org.cocktail.gfc.comptabilite.generale.api.HelloComptableEtBudgetaireService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.transaction.Transactional;

@Named
@Singleton
@Transactional(rollbackOn = Exception.class)
public class HelloComptableEtBudgetaireServiceImpl implements HelloComptableEtBudgetaireService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloComptableEtBudgetaireService.class);
    
    @Inject
    private HelloBudgetaireService helloBudgetaireService;
    
    @Inject
    private ApplicationEventPublisher publisher;
    
    @Override
    public String hello() {
        LOGGER.info("Into compta generale hello method");
        String hello = helloBudgetaireService.hello() + " et compta-generale (bisous)";
        publisher.publishEvent(new HelloComptaGeneraleSentEvent());
        return hello;
    }

}

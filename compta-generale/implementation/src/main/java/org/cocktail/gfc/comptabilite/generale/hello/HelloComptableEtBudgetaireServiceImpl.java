package org.cocktail.gfc.comptabilite.generale.hello;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.cocktail.gfc.comptabilite.budgetaire.api.HelloBudgetaireService;
import org.cocktail.gfc.comptabilite.generale.api.HelloComptaGeneraleSentEvent;
import org.cocktail.gfc.comptabilite.generale.api.HelloComptableEtBudgetaireService;
import org.springframework.context.ApplicationEventPublisher;

@Named
@Singleton
public class HelloComptableEtBudgetaireServiceImpl implements HelloComptableEtBudgetaireService {

    @Inject
    private HelloBudgetaireService helloBudgetaireService;
    
    @Inject
    private ApplicationEventPublisher publisher;
    
    @Override
    public String hello() {
        String hello = helloBudgetaireService.hello() + " et compta-generale";
        publisher.publishEvent(new HelloComptaGeneraleSentEvent());
        return hello;
    }

}

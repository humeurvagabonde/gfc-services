package org.cocktail.gfc.comptabilite.budgetaire.application.hello;

import javax.inject.Named;
import javax.inject.Singleton;

import org.cocktail.gfc.comptabilite.budgetaire.api.HelloBudgetaireService;

@Named
@Singleton
public class HelloBudgetaireServiceImpl implements HelloBudgetaireService {

    @Override
    public String hello() {
        return "hello from compta-budgetaire";
    }

}

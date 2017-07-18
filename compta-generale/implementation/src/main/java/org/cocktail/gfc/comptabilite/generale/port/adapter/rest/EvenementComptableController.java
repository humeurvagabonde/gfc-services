package org.cocktail.gfc.comptabilite.generale.port.adapter.rest;

import javax.inject.Inject;

import org.cocktail.gfc.comptabilite.generale.api.HelloComptableEtBudgetaireService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compta-generale")
public class EvenementComptableController {

    @Inject
    private HelloComptableEtBudgetaireService helloComptableEtBudgetaireService;
    
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello() {
        return helloComptableEtBudgetaireService.hello();
    }
    
}

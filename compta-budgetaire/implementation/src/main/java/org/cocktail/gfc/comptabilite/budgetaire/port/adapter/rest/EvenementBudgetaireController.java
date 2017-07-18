package org.cocktail.gfc.comptabilite.budgetaire.port.adapter.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compta-budgetaire")
public class EvenementBudgetaireController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World!";
    }
    
}

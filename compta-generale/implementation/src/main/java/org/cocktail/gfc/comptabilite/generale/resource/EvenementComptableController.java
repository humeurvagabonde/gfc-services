package org.cocktail.gfc.comptabilite.generale.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compta-generale")
public class EvenementComptableController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World!";
    }
    
}

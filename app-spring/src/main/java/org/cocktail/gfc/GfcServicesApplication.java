package org.cocktail.gfc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * L'utilisation du package org.cocktail.gfc (et non org.cocktail.gfc.application) *
 * permet de ne pas devoir définir l'attribut basePackage
 * Le componentScan va enregistrer tous les beans en démarrant de org.cocktail.gfc
 * 
 */
@SpringBootApplication
public class GfcServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GfcServicesApplication.class, args);
    }

}
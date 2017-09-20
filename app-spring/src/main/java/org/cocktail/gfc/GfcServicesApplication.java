package org.cocktail.gfc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * L'utilisation du package org.cocktail.gfc (et non org.cocktail.gfc.application) *
 * permet de ne pas devoir définir l'attribut basePackage
 * Le componentScan va enregistrer tous les beans en démarrant de org.cocktail.gfc
 * 
 */
@SpringBootApplication
public class GfcServicesApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GfcServicesApplication.class, args);
    }

}
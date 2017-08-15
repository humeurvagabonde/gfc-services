package org.cocktail.gfc.comptabilite.generale.application;

import org.cocktail.gfc.comptabilite.generale.api.BrouillardCreeEvent;
import org.cocktail.gfc.comptabilite.generale.api.ComptaGeneraleService;
import org.springframework.context.ApplicationEventPublisher;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.Random;

@Named
@Singleton
@Transactional
public class BrouillardApplicationService implements ComptaGeneraleService {

    @Inject
    private ApplicationEventPublisher publisher;

    @Override
    public void creerBrouillard() {
        // creer le brouillard
        // enregistrer le brouillard


        // publier evenement
        Random idGenerator = new Random();
        publisher.publishEvent(new BrouillardCreeEvent(idGenerator.nextLong()));

    }
}

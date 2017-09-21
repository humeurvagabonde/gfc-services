package org.cocktail.gfc.comptabilite.generale.application;

import org.cocktail.gfc.comptabilite.generale.api.BrouillardCreeEvent;
import org.cocktail.gfc.comptabilite.generale.api.ComptaGeneraleService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.util.Random;

@Named
@Singleton
@Transactional
public class BrouillardApplicationService implements ComptaGeneraleService {

    @Inject
    private ApplicationEventPublisher publisher;

    @Inject
    private DataSource dataSource;

    @Override
    public void creerBrouillard() {
        // creer le brouillard
        // enregistrer le brouillard
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(
                "insert into gfc.adm_exercice_cocktail (exe_ordre, exe_exercice) values (?, ?)",
                1900, 1900);

        // publier evenement
        Random idGenerator = new Random();
        publisher.publishEvent(new BrouillardCreeEvent(idGenerator.nextLong()));

    }
}

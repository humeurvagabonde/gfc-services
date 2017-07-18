package org.cocktail.gfc.depense.port.adapter.service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.cocktail.gfc.depense.metier.modele.sf.ServiceFaitCycleVieService;
import org.springframework.jdbc.core.JdbcTemplate;

@Named
@Singleton
public class PlSqlServiceFaitCYcleVieService implements ServiceFaitCycleVieService {

    @Inject
    private JdbcTemplate jdbcTemplate;
    
}

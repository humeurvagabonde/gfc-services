package org.cocktail.gfc.depense.application.sf;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import org.cocktail.gfc.depense.api.CreerSfCommand;
import org.cocktail.gfc.depense.api.ServiceFaitService;
import org.cocktail.gfc.depense.metier.modele.sf.ServiceFaitCycleVieService;

@Named
@Singleton
@Transactional(rollbackOn = Exception.class)
public class ServiceFaitApplicationService implements ServiceFaitService { 
    
    @Inject
    private ServiceFaitCycleVieService sfCycleVieService;
    
    public Long creer(CreerSfCommand command) {
        return -1L;
    }

    @Override
    public void mettreAJour(Long idDepSf, String reference, String commentaire, String dateSf, Long persId, Long persOdModification, String lignesSf) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void supprimer(Long idDepSf) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void constater(Long idDepSf, Long persIdModification) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void annulerConstatation(Long idDepSf, Long persIdModification) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void certifier(Long idDepSf, Long persIdModification) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void annulerCertification(Long idDepSf, Long persIdModification) {
        // TODO Auto-generated method stub
        
    }
    
}

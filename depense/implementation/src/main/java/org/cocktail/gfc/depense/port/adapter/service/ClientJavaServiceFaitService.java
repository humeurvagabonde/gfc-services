package org.cocktail.gfc.depense.port.adapter.service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.cocktail.gfc.depense.api.ServiceFaitService;
import org.cocktail.gfc.depense.application.sf.CreerSfCommand;
import org.cocktail.gfc.depense.application.sf.ServiceFaitApplicationService;

@Named
@Singleton
public class ClientJavaServiceFaitService implements ServiceFaitService {

    @Inject
    private ServiceFaitApplicationService sfAppService;
    
    @Override
    public Long creer(Long idDepEJ, Long exeOrdre, String reference, String commentaire, String dateSf, Long persId, String nomApplication, String lignesSf) {
        CreerSfCommand command = CreerSfCommand.of(exeOrdre, reference, commentaire, dateSf, persId, nomApplication, lignesSf);
        return sfAppService.creer(command);
    }

    @Override
    public void mettreAJour(Long idDepSf, String reference, String commentaire, String dateSf, Long persId, Long persOdModification, String lignesSf) {

    }

    @Override
    public void supprimer(Long idDepSf) {

    }

    @Override
    public void constater(Long idDepSf, Long persIdModification) {

    }

    @Override
    public void annulerConstatation(Long idDepSf, Long persIdModification) {
        // TODO Auto-generated method stub

    }

    @Override
    public void certifier(Long idDepSf, Long persIdModification) {

    }

    @Override
    public void annulerCertification(Long idDepSf, Long persIdModification) {

    }

}

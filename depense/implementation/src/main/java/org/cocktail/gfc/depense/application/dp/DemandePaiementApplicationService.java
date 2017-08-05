package org.cocktail.gfc.depense.application.dp;

import org.cocktail.gfc.depense.api.DemandePaiementService;
import org.cocktail.gfc.depense.metier.modele.dp.DemandePaiement;
import org.cocktail.gfc.depense.metier.modele.dp.DemandePaiementRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.transaction.Transactional;

@Named
@Singleton
@Transactional(rollbackOn = Exception.class)
public class DemandePaiementApplicationService implements DemandePaiementService {

    @Inject
    private DemandePaiementRepository dpRepo;

    public DemandePaiement charger(Long id) {
        DemandePaiement dp = dpRepo.findOne(id);
        dp.getLignes();
        return dp;
    }

}

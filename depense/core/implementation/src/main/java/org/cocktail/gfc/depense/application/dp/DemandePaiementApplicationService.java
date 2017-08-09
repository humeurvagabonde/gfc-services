package org.cocktail.gfc.depense.application.dp;

import org.cocktail.gfc.common.bean.montant.Montant;
import org.cocktail.gfc.common.bean.montant.Pourcentage;
import org.cocktail.gfc.common.bean.montant.Quantite;
import org.cocktail.gfc.depense.api.DemandePaiementService;
import org.cocktail.gfc.depense.metier.modele.dp.DemandePaiement;
import org.cocktail.gfc.depense.metier.modele.dp.DemandePaiementLigne;
import org.cocktail.gfc.depense.metier.modele.dp.DemandePaiementRepartArticle;
import org.cocktail.gfc.depense.metier.modele.dp.DemandePaiementRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.List;

@Named
@Singleton
@Transactional(rollbackOn = Exception.class)
public class DemandePaiementApplicationService implements DemandePaiementService {

    @Inject
    private DemandePaiementRepository dpRepo;

    public DemandePaiement charger(Long id) {
        DemandePaiement dp = dpRepo.findOne(id);
        List<DemandePaiementLigne> lignes =  dp.getRepartArticle().getLignes();
        return dp;
    }

    public void ajouterBienAPayer(Long id) {
        DemandePaiementLigne nxBien = new DemandePaiementLigne(
                "test fla",
                Montant.ZERO,
                new Montant(10d),
                new Montant(10d),
                Montant.ZERO,
                new Quantite(1d),
                new Pourcentage(0d),
                0L,
                "DIRECTE");

        DemandePaiement dp = dpRepo.findOne(id);
        dp.getRepartArticle().getLignes().add(nxBien);

        dpRepo.save(dp);
    }

}

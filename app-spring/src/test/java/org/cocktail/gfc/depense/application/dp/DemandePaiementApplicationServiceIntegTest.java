package org.cocktail.gfc.depense.application.dp;

import org.cocktail.gfc.common.bean.montant.Montant;
import org.cocktail.gfc.depense.metier.modele.dp.DemandePaiement;
import org.cocktail.gfc.depense.metier.modele.dp.DemandePaiementLigne;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Ignore
public class DemandePaiementApplicationServiceIntegTest {

    @Inject
    private DemandePaiementApplicationService dpAppService;

    @Test
    @Ignore
    public void testChargementDpAvecLigne() {
        DemandePaiement dp = dpAppService.charger(1013540L);
        List<DemandePaiementLigne> lignes = dp.getRepartArticle().getLignes();
        Assert.assertNotNull(dp);
        Assert.assertEquals(new Montant(1048.25d), dp.getMontantAPayerTTC());
        Assert.assertEquals(3, lignes.size());
    }

    @Test
    @Ignore
    public void testAjouterBienAPayer() {
        dpAppService.ajouterBienAPayer(1013540L);
    }

    @Test
    public void testValider() {
        dpAppService.valider(1013543L, 4L);
        DemandePaiement dp = dpAppService.charger(1013543L);
        Assert.assertEquals(1L, dp.getTyetId()); // VALIDE
    }

}

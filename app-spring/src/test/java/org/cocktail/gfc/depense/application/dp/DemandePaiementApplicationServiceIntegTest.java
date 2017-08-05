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
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DemandePaiementApplicationServiceIntegTest {

    @Inject
    private DemandePaiementApplicationService dpAppService;

    @Test
    @Ignore
    public void testChargementDpAvecLigne() {
        DemandePaiement dp = dpAppService.charger(1013540L);
        List<DemandePaiementLigne> lignes = dp.getLignes();
        Assert.assertNotNull(dp);
        Assert.assertEquals(new Montant(1048.25d), dp.getMontantAPayerTTC());
        Assert.assertEquals(2, lignes.size());
    }

}
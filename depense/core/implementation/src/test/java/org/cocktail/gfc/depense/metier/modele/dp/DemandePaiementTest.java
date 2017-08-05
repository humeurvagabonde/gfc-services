package org.cocktail.gfc.depense.metier.modele.dp;

import org.cocktail.gfc.common.bean.montant.Montant;
import org.junit.Assert;
import org.junit.Test;

public class DemandePaiementTest {

    @Test
    public void testConstruction() {
        DemandePaiement dp = new DemandePaiement(null, "NUM_DP", 10L,
                new Montant(10d), new Montant(11d), "libelle", new Montant(12d), new Montant(13d),
                11L, new Montant(14d), 12L, "2017-10-10",
                null, null, 2017, 4,
                new Montant(15d), new Montant(16d), new Montant(17d),
                "2017-10-11", "2017-10-12", false, 0);
        Assert.assertNotNull(dp);
        Assert.assertEquals(0, dp.getLignes().size());
    }

}

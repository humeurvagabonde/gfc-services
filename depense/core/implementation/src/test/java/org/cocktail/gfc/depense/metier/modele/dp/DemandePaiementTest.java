package org.cocktail.gfc.depense.metier.modele.dp;

import org.cocktail.gfc.common.bean.montant.Montant;
import org.junit.Assert;
import org.junit.Test;

public class DemandePaiementTest {

    @Test
    public void testConstruction() {
        DemandePaiement dp = new DemandePaiement("NUM_DP", 2017,10L, 11L,
                "libelle", new Montant(10d), new Montant(11d), new Montant(12d), new Montant(13d),
                new Montant(14d), new Montant(15d), new Montant(16d), new Montant(17d),
                "2017-10-11", "2017-10-12",
                11L, "2017-10-10", 4, false);
        Assert.assertNotNull(dp);
        Assert.assertEquals(0, dp.getLignes().size());
    }

}

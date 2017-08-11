package org.cocktail.gfc.depense.financement.port.adapter.persistence;


import org.cocktail.gfc.depense.financement.metier.modele.dp.FinancementDemandePaiement;
import org.cocktail.gfc.depense.financement.metier.modele.dp.FinancementDemandePaiementRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
public class JpaFinancementDemandePaiementRepositoryTest {

    @Inject
    private FinancementDemandePaiementRepository financementDpRepo;

    @Test
    public void testChargerFinancementDp() {
        FinancementDemandePaiement financementDp = financementDpRepo.findOne(1013339L);
        Assert.assertNotNull(financementDp);
    }

}

package org.cocktail.gfc.depense.financement.metier.modele.dp;

public interface FinancementDemandePaiementRepository {

    FinancementDemandePaiement save(FinancementDemandePaiement financementDp);
    FinancementDemandePaiement findOne(Long idDp);
    void delete(FinancementDemandePaiement financementDp);

}

package org.cocktail.gfc.depense.metier.modele.dp;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DemandePaiementRepository extends PagingAndSortingRepository<DemandePaiement, Long>, JpaSpecificationExecutor<DemandePaiement> {
}

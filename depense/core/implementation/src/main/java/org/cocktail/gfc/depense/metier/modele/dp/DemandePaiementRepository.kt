package org.cocktail.gfc.depense.metier.modele.dp

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.Repository

interface DemandePaiementRepository : CrudRepository<DemandePaiement, Long>
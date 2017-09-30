package org.cocktail.gfc.depense.metier.modele.codeanalytique

import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.PagingAndSortingRepository

interface CodeAnalytiqueRepository : PagingAndSortingRepository<CodeAnalytique, Long>, JpaSpecificationExecutor<CodeAnalytique>
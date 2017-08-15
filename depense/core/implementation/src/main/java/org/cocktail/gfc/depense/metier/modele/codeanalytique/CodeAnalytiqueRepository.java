package org.cocktail.gfc.depense.metier.modele.codeanalytique;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CodeAnalytiqueRepository extends PagingAndSortingRepository<CodeAnalytique, Long>, JpaSpecificationExecutor<CodeAnalytique> {

}

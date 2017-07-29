package org.cocktail.gfc.depense.metier.modele.codeanalytique;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CodeAnalytiqueRepository extends CrudRepository<CodeAnalytique, Long>, JpaSpecificationExecutor<CodeAnalytique> {

}

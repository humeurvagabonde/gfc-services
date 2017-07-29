package org.cocktail.gfc.depense.metier.modele.codeanalytique

import org.springframework.data.jpa.domain.Specifications
import au.com.console.jpaspecificationdsl.*

data class CodeAnalytiqueQuery(
    val code: String? = null,
    val libelle: String? = null
)

// Convenience functions (using the DSL) that make assembling queries more readable and allows for dynamic queries.
// Note: these functions return null for a null input. This means that when included in
// and() or or() they will be ignored as if they weren't supplied.

fun hasCode(code: String?): Specifications<CodeAnalytique>? = code?.let {
    CodeAnalytique::code.equal(it)
}

fun hasLibelle(libelle: String?): Specifications<CodeAnalytique>? = libelle?.let {
    CodeAnalytique::libelle.equal(it)
}

/**
 * A single CodeAnalytiqueQuery is equivalent to an AND of all supplied criteria.
 * Note: any criteria that is null will be ignored (not included in the query).
 */
fun CodeAnalytiqueQuery.toSpecification(): Specifications<CodeAnalytique> = and(
    hasCode(code),
    hasLibelle(libelle)
)


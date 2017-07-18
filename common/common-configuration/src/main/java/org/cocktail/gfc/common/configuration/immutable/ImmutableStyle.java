package org.cocktail.gfc.common.configuration.immutable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.immutables.value.Value;

@Target({ ElementType.PACKAGE, ElementType.TYPE })
@Retention(RetentionPolicy.CLASS) // Make it class retention for incremental compilation
@Value.Style(
    typeAbstract = { "Abstract*" }, // 'Abstract' prefix will be detected and trimmed
    typeImmutable = "Cktl*", // No prefix or suffix for generated immutable type
    defaults = @Value.Immutable(copy = false) // Disable copy methods by default
)
public @interface ImmutableStyle {

}

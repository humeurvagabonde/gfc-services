package org.cocktail.gfc.common.persistence;

import org.cocktail.gfc.common.bean.montant.Quantite;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.math.BigDecimal;

@Converter(autoApply = true)
public class QuantiteAttributeConverter implements AttributeConverter<Quantite, BigDecimal> {

    @Override
    public BigDecimal convertToDatabaseColumn(Quantite attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.value();
    }

    @Override
    public Quantite convertToEntityAttribute(BigDecimal dbData) {
        return Quantite.parseOptional(dbData);
    }
}
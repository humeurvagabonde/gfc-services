package org.cocktail.gfc.common.persistence;

import org.cocktail.gfc.common.bean.montant.Montant;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.math.BigDecimal;

@Converter(autoApply = true)
public class MontantAttributeConverter implements AttributeConverter<Montant, BigDecimal> {

    @Override
    public BigDecimal convertToDatabaseColumn(Montant attribute) {
        return Montant.rawValue(attribute);
    }

    @Override
    public Montant convertToEntityAttribute(BigDecimal dbData) {
        return Montant.parseOptional(dbData);
    }
}

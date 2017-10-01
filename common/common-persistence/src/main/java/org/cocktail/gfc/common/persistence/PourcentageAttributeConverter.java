package org.cocktail.gfc.common.persistence;

import org.cocktail.gfc.common.bean.montant.Pourcentage;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.math.BigDecimal;

@Converter(autoApply = true)
public class PourcentageAttributeConverter implements AttributeConverter<Pourcentage, BigDecimal> {

    @Override
    public BigDecimal convertToDatabaseColumn(Pourcentage attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.value();
    }

    @Override
    public Pourcentage convertToEntityAttribute(BigDecimal dbData) {
        if (dbData == null) {
            return null;
        }
        return new Pourcentage(dbData);
    }
}
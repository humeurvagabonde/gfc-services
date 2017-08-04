package org.cocktail.gfc.common.beans.montant;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Currency;

public interface ExchangeRateProvider {
    BigDecimal getExchangeRate(Currency originCurrency,Currency targetCurrency) throws UnsupportedCurrenciesException;

    class UnsupportedCurrenciesException extends Exception{}


    public static class DefaultImplementation implements ExchangeRateProvider{

        @Override
        public BigDecimal getExchangeRate(Currency originCurrency, Currency targetCurrency) throws UnsupportedCurrenciesException {
            throw new UnsupportedCurrenciesException();
        }
    }

    public static class XPFImplementation implements ExchangeRateProvider{

        private String conversionNbXpfPour1Euro = "119.33174";

        @Override
        public BigDecimal getExchangeRate(Currency originCurrency, Currency targetCurrency) throws UnsupportedCurrenciesException {
            if ("XPF".equals(originCurrency.getCurrencyCode())){
                if ("EUR".equals(targetCurrency.getCurrencyCode())){
                    BigDecimal tauxDeConversion = new BigDecimal(1.0);
                    tauxDeConversion=tauxDeConversion.setScale(30, RoundingMode.HALF_EVEN);
                    return tauxDeConversion.divide(new BigDecimal(conversionNbXpfPour1Euro).setScale(30, RoundingMode.HALF_EVEN), MathContext.DECIMAL128).setScale(30, RoundingMode.HALF_EVEN);
                }
            }
            throw new UnsupportedCurrenciesException();
        }
    }
}



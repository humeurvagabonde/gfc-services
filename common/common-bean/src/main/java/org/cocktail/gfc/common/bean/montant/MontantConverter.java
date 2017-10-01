package org.cocktail.gfc.common.bean.montant;

import org.cocktail.gfc.common.bean.montant.ExchangeRateProvider;
import org.cocktail.gfc.common.bean.montant.ExchangeRateProvider.UnsupportedCurrenciesException;

import java.math.BigDecimal;
import java.util.Currency;

public class MontantConverter {

    public static final String exchangeRateProviderFactoryClassName = "org.cocktail.gfc.common.exchangeRateProviderFactoryClassName";

    private static ExchangeRateProvider exchangeRateProvider;

    public static Montant exchange(Montant montant, Currency targetCurrency) throws UnsupportedCurrenciesException{
        if (montant.getDevise()==targetCurrency)
            return montant;
        else {
            BigDecimal m = montant.value();
            BigDecimal taux = getExchangeRate(montant.getDevise(),targetCurrency);
            BigDecimal m2 = m.multiply(taux);
            return new Montant(m2,targetCurrency);
        }


    }

    private static BigDecimal getExchangeRate(Currency originCurrency,Currency targetCurrency) throws UnsupportedCurrenciesException {
        ExchangeRateProvider provider=null;
        try {
            provider = getExchangeRateProvider();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
        }
        if (provider==null)
            throw new RuntimeException("ExchangeRateProvider not provided. Please check your configuration");
        return provider.getExchangeRate(originCurrency, targetCurrency);
    }

    public static void setExchangeRateProvider(ExchangeRateProvider exchangeRateProvider) {
        MontantConverter.exchangeRateProvider = exchangeRateProvider;
    }

    private static ExchangeRateProvider getExchangeRateProvider() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (exchangeRateProvider==null){
            String className = System.getProperty(exchangeRateProviderFactoryClassName,ExchangeRateProvider.DefaultImplementation.class.getName());
            if (className!=null){
                Class fact = Class.forName(className);
                if (ExchangeRateProvider.class.isAssignableFrom(fact))
                    exchangeRateProvider = (ExchangeRateProvider)fact.newInstance();
            }
        }
        return exchangeRateProvider;
    }

}

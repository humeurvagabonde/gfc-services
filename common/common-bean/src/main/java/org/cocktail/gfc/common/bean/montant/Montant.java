/*
 * Copyright COCKTAIL (www.asso-cocktail.fr), 1995, 2015 This software
 * is governed by the CeCILL license under French law and abiding by the
 * rules of distribution of free software. You can use, modify and/or
 * redistribute the software under the terms of the CeCILL license as
 * circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info".
 * As a counterpart to the access to the source code and rights to copy, modify
 * and redistribute granted by the license, users are provided only with a
 * limited warranty and the software's author, the holder of the economic
 * rights, and the successive licensors have only limited liability. In this
 * respect, the user's attention is drawn to the risks associated with loading,
 * using, modifying and/or developing or reproducing the software by the user
 * in light of its specific status of free software, that may mean that it
 * is complicated to manipulate, and that also therefore means that it is
 * reserved for developers and experienced professionals having in-depth
 * computer knowledge. Users are therefore encouraged to load and test the
 * software's suitability as regards their requirements in conditions enabling
 * the security of their systems and/or data to be ensured and, more generally,
 * to use and operate it in the same conditions as regards security. The
 * fact that you are presently reading this means that you have had knowledge
 * of the CeCILL license and that you accept its terms.
 */
package org.cocktail.gfc.common.bean.montant;

import org.apache.commons.lang3.math.NumberUtils;
import org.cocktail.gfc.common.beans.montant.ExchangeRateProvider.UnsupportedCurrenciesException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Locale;

import static org.apache.commons.lang3.Validate.notNull;


public class Montant implements Comparable<Montant> {

    public static final Montant ZERO = new Montant(BigDecimal.ZERO);
    public static final Integer DEFAULT_NB_DECIMALES = 2;
    public static final RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_UP;

    private BigDecimal montant;
    private final Currency devise;

    public static Montant montantWithLocalCurrency(BigDecimal montant){
        Currency devise = getLocalCurrency();
        return new Montant(montant, devise);
    }

    private static Currency getLocalCurrency() {
        String deviseCode = System.getProperty("gfc.deviseCode");
        if (deviseCode == null) {
            return Currency.getInstance(Locale.FRANCE);//Default Currency
        } else {
            return Currency.getInstance(deviseCode);
        }
    }
    private static Currency getReferenceCurrency() {
        return Currency.getInstance(Locale.FRANCE);
    }

    public Montant(BigDecimal montant,Currency devise) {
        notNull(montant, "Un montant ne peut pas être null");
        this.montant = montant;
        this.devise = devise;
    }

    public Montant(Double montant,Currency devise) {
        notNull(montant, "Un montant ne peut pas être null");
        this.montant = BigDecimal.valueOf(montant);
        this.devise = devise;
    }

    public Montant(Montant montant,Currency devise) {
        notNull(montant, "Un montant ne peut pas être null");
        this.montant = montant.value().setScale(30,RoundingMode.HALF_UP);
        this.devise = devise;
    }

    public Montant(BigDecimal montant) {
        this(montant,Montant.getLocalCurrency());
    }

    public Montant(Double montant) {
        this(montant,Montant.getLocalCurrency());
    }

    public Montant(Montant montant) {
        this(montant,Montant.getLocalCurrency());
    }

    /**
     * @param montant la chaine representant le montant.
     * @return un Montant si argument non null et valide; null si argument null et NumberFormatException si la chaine n'est pas un nombre valide..
     */
    public static Montant parseOptional(String montant) {
        if (montant == null) {
            return null;
        }
        if (!NumberUtils.isNumber(montant)) {
            throw new IllegalArgumentException("Le montant '" + montant + "' est invalide ");
        }
        return new Montant(new BigDecimal(montant));
    }

    public static Montant parseOptional(BigDecimal montant) {
        if (montant == null) {
            return null;
        }
        return new Montant(montant);
    }

    public static Montant parseOptionalWithDefault(BigDecimal montant, Montant defaultValue) {
        if (montant == null) {
            return new Montant(defaultValue.value());
        }
        return new Montant(montant);
    }

    public static Montant parseOptionalWithDefault(Montant montant, Montant defaultValue) {
        if (montant == null) {
            return new Montant(defaultValue.value());
        }
        return new Montant(montant);
    }

    public static BigDecimal rawValue(Montant montant) {
        return rawValueWithDefault(montant, null);
    }

    public static BigDecimal rawValueWithDefault(Montant montant, BigDecimal defaultValue) {
        if (montant == null) {
            return defaultValue;
        }
        return montant.value();
    }

    public Montant ajouter(Montant montantAjouter) {
        BigDecimal somme = montant.add(montantAjouter.value());
        return new Montant(somme);
    }

    public Montant ajouter(Montant... montantAjouter) {
        BigDecimal somme = this.montant;
        for (Montant currentMontant : montantAjouter) {
            somme = somme.add(currentMontant.value());
        }

        return new Montant(somme);
    }

    public Montant soustraire(Montant montantSoustrait) {
        BigDecimal nxMontant = montant.subtract(montantSoustrait.value());
        return new Montant(nxMontant);
    }

    public Montant multiplier(Quantite qte) {
        BigDecimal nxMontant = montant.multiply(qte.value());
        return new Montant(nxMontant);
    }

    public Montant multiplier(int i) {
        BigDecimal nxMontant = montant.multiply(new BigDecimal(i));
        return new Montant(nxMontant);
    }

    public Montant prorata(Pourcentage taux) {
        BigDecimal nxMontant = montant.multiply(taux.taux());
        return new Montant(nxMontant);
    }

    public Pourcentage ratio(Montant total) {
        BigDecimal ratio = montant.multiply(Pourcentage.CENT.value()).divide(total.value(), 7, DEFAULT_ROUNDING);
        return new Pourcentage(ratio);
    }

    public BigDecimal value() {
        return montant;
    }

    /**
     * @return La valeur du montant arrondi à Montant.DEFAULT_NB_DECIMALES après la virgule,
     *         en utilisant la méthode d'arrondi par défaut (RoundingMode.HALF_UP)
     * @deprecated Utiliser {@link #valeurArrondiePourRepresentationDefaultDecimales()}
     *             ou {@link #valeurArrondiePourRepresentation(Integer)}
     *             ou {@link #valeurArrondiePourRepresentation(Integer, RoundingMode)}
     */
    @Deprecated
    public BigDecimal valeurArrondiePourRepresentation() {
        return valeurArrondiePourRepresentationDefaultDecimales();
    }

    public BigDecimal valeurArrondiePourRepresentationDefaultDecimales() {
        return valeurArrondiePourRepresentation(DEFAULT_NB_DECIMALES);
    }

    /**
     * @param nbDecimales Le nombre de décimales à garder après la virgule
     * @return La valeur du montant arrondi,
     *         en utilisant la méthode d'arrondi par défaut (RoundingMode.HALF_UP)
     */
    public BigDecimal valeurArrondiePourRepresentation(Integer nbDecimales) {
        return valeurArrondiePourRepresentation(nbDecimales, DEFAULT_ROUNDING);
    }

    /**
     * @param nbDecimales Le nombre de décimales à garder après la virgule
     * @param roundingMode La méthode d'arrondi à utiliser (cf. {@link RoundingMode} )
     * @return La valeur du montant arrondi
     */
    public BigDecimal valeurArrondiePourRepresentation(Integer nbDecimales, RoundingMode roundingMode) {
        return montant.setScale(nbDecimales, roundingMode);
    }

    public int signum() {
        return montant.signum();
    }

    public boolean isZero() {
        return montant.signum() == 0;
    }

    public boolean isNonZero() {
        return montant.signum() != 0;
    }

    public boolean isPositive() {
        return montant.signum() >= 0;
    }

    public boolean isStrictlyPositive() {
        return montant.signum() > 0;
    }

    public boolean isNegative() {
        return montant.signum() <= 0;
    }

    public boolean isStrictlyNegative() {
        return montant.signum() < 0;
    }

    public Montant negate() {
        return new Montant(montant.negate());
    }

    public Montant abs() {
        return new Montant(montant.abs());
    }

    public Currency getDevise() {
        return devise;
    }

    public Montant max(Montant m) {
        try {
            return new Montant(valueInReferenceCurrency().max(m.valueInReferenceCurrency()));
        } catch (UnsupportedCurrenciesException e) {
            throw new RuntimeException(e);
        }
    }

    public Montant min(Montant m) {
        try {
            return new Montant(valueInReferenceCurrency().min(m.valueInReferenceCurrency()));
        } catch (UnsupportedCurrenciesException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean lessThan(Montant m) {
        return compareTo(m) <= 0;
    }

    public boolean strictlyLessThan(Montant m) {
        return compareTo(m) < 0;
    }

    public boolean greaterThan(Montant m) {
        return compareTo(m) >= 0;
    }

    public boolean strictlyGreaterThan(Montant m) {
        return compareTo(m) > 0;
    }

    public boolean isSameSignum(Montant m) {
        return this.signum() == m.signum();
    }

    @Override
    public int compareTo(Montant o) {
        try {
            if (o.devise == this.devise){
                int nbDecimales = 15;
                BigDecimal a = this.value().setScale(nbDecimales,RoundingMode.HALF_EVEN);
                BigDecimal b = o.value().setScale(nbDecimales,RoundingMode.HALF_EVEN);
                return a.compareTo(b);
            }
            Montant montantInReferenceCurrency = montantInReferenceCurrency();
            Montant oMontantInReferenceCurrency = o.montantInReferenceCurrency();
            return montantInReferenceCurrency.compareTo(oMontantInReferenceCurrency);
        } catch (UnsupportedCurrenciesException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Montant [" + value() + "]("+devise.getSymbol()+")";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((montant == null) ? 0 : montant.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Montant other = (Montant) obj;
        if (montant == null) {
            if (other.montant != null) {
                return false;
            }
        } else if (this.compareTo(other) != 0) {
            return false;
        }
        return true;
    }

    public static final Montant minAbs(Montant a, Montant b) {
        if (a.abs().strictlyGreaterThan(b.abs())) {
            return b;
        }
        return a;
    }

    public static final Montant min(Montant a, Montant b) {
        if (a.strictlyGreaterThan(b)) {
            return b;
        }
        return a;
    }

    public Montant montant(Currency currency) throws UnsupportedCurrenciesException{
        return MontantConverter.exchange(this, currency);
    }

    public Montant montantInReferenceCurrency() throws UnsupportedCurrenciesException{
        return montant(getReferenceCurrency());
    }

    public BigDecimal valueInReferenceCurrency() throws UnsupportedCurrenciesException{
        return montantInReferenceCurrency().value();
    }
}

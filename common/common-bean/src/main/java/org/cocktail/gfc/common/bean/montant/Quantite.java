package org.cocktail.gfc.common.bean.montant;

import static org.apache.commons.lang3.Validate.notNull;

import java.math.BigDecimal;

public class Quantite {

    public static final Quantite ZERO = new Quantite(BigDecimal.ZERO);
    public static final Quantite UNE = new Quantite(BigDecimal.ONE);

    private BigDecimal qte;

    public Quantite(BigDecimal qte) {
        notNull(qte, "Une quantité ne peut pas être null");
        this.qte = qte;
    }

    public Quantite(Double qte) {
        notNull(qte, "Une quantité ne peut pas être null");
        this.qte = BigDecimal.valueOf(qte);
    }

    public static Quantite parseOptional(BigDecimal qte) {
        if (qte == null) {
            return null;
        }
        return new Quantite(qte);
    }

    public static Quantite parseOptionalWithDefault(BigDecimal qte, Quantite defaultValue) {
        if (qte == null) {
            return new Quantite(defaultValue.value());
        }
        return new Quantite(qte);
    }

    public BigDecimal value() {
        return qte;
    }

    public Quantite ajouter(Quantite quantiteAjoutee) {
        BigDecimal nvlleQte = qte.add(quantiteAjoutee.value());
        return new Quantite(nvlleQte);
    }

    public Quantite soustraire(Quantite quantiteSoustraite) {
        BigDecimal nvlleQte = qte.subtract(quantiteSoustraite.value());
        return new Quantite(nvlleQte);
    }

    @Override
    public String toString() {
        return "Quantité [" + value() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((qte == null) ? 0 : qte.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Quantite other = (Quantite) obj;
        if (qte == null) {
            if (other.value() != null)
                return false;
        } else if (qte.compareTo(other.value()) != 0)
            return false;
        return true;
    }

}

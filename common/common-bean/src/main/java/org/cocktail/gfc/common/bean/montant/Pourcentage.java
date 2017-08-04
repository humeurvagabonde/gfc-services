/*
 * Copyright COCKTAIL (www.asso-cocktail.fr), 1995, 2017 This software
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

import static org.apache.commons.lang3.Validate.notNull;

import java.math.BigDecimal;

public class Pourcentage {

    public static final Pourcentage ZERO = new Pourcentage(BigDecimal.ZERO);
    public static final Pourcentage CENT = new Pourcentage(BigDecimal.valueOf(100d));

    private BigDecimal value;

    public Pourcentage(BigDecimal pourcentage) {
        notNull(pourcentage, "Un pourcentage ne peut pas être null");
        this.value = pourcentage;
    }

    public Pourcentage(Double pourcentage) {
        notNull(pourcentage, "Un pourcentage ne peut pas être null");
        this.value = BigDecimal.valueOf(pourcentage);
    }

    public BigDecimal value() {
        return value;
    }

    public BigDecimal taux() {
        return value.divide(CENT.value());
    }

    @Override
    public String toString() {
        return "Pourcentage [" + value() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
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
        Pourcentage other = (Pourcentage) obj;
        if (value == null) {
            if (other.value() != null) {
                return false;
            }
        } else if (value.compareTo(other.value()) != 0) {
            return false;
        }
        return true;
    }

}

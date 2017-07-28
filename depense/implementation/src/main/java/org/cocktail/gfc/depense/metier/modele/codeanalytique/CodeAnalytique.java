package org.cocktail.gfc.depense.metier.modele.codeanalytique;

import javax.persistence.*;

@Entity
@Table(name = "ADM_CODE_ANALYTIQUE", schema = "GFC")
public class CodeAnalytique {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CAN_ID")
    private Long id;

    @Column(name = "CAN_CODE")
    private String code;

    @Column(name = "CAN_LIBELLE")
    private String libelle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CodeAnalytique that = (CodeAnalytique) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        return libelle != null ? libelle.equals(that.libelle) : that.libelle == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        return result;
    }
}

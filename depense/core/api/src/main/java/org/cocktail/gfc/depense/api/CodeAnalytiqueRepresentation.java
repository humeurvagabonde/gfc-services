package org.cocktail.gfc.depense.api;

public class CodeAnalytiqueRepresentation {

    private String code;
    private String libelle;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CodeAnalytiqueRepresentation that = (CodeAnalytiqueRepresentation) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        return libelle != null ? libelle.equals(that.libelle) : that.libelle == null;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        return result;
    }
}

package cz.czechitas.lekce6.nakupniseznam;

import java.util.Objects;

/**
 * Položka nákupního seznamu.
 */
public class Polozka {
    private String popis;
    private int mnozstvi;
    private String jednotka;

    public Polozka(String popis, int mnozstvi, String jednotka) {
        this.popis = popis;
        this.mnozstvi = mnozstvi;
        this.jednotka = jednotka;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = Objects.requireNonNull(popis);
    }

    public int getMnozstvi() {
        return mnozstvi;
    }

    public void setMnozstvi(int mnozstvi) {
        if (mnozstvi <= 0) {
            throw new IllegalArgumentException();
        }
        this.mnozstvi = mnozstvi;
    }

    public String getJednotka() {
        return jednotka;
    }

    public void setJednotka(String jednotka) {
        this.jednotka = Objects.requireNonNull(jednotka);
    }

    @Override
    public String toString() {
        return String.format("%s (%d %s)", popis, mnozstvi, jednotka);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polozka)) return false;
        Polozka polozka = (Polozka) o;
        return mnozstvi == polozka.mnozstvi && popis.equals(polozka.popis) && jednotka.equals(polozka.jednotka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(popis, mnozstvi, jednotka);
    }
}

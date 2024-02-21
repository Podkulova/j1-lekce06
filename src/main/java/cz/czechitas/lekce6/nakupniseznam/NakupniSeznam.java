package cz.czechitas.lekce6.nakupniseznam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NakupniSeznam {
    private final List<Polozka> seznam = new ArrayList<>();

    public void run() {
        naplnSeznam();
        System.out.printf("Na začátku seznam obsahuje %d položek:", seznam.size()).println();
        System.out.println(this);

        Polozka tretiPolozka = ziskejTretiPolozku();
        System.out.printf("Třetí položka je: %s", tretiPolozka).println();

        smazDruhouPolozku();
        tretiPolozka = ziskejTretiPolozku();
        System.out.printf("Nová třetí položka je: %s", tretiPolozka).println();

        pridejDalsiPolozku();
        System.out.printf("Na konci seznam obsahuje %d položek:", seznam.size()).println();
        System.out.println(this);
    }

    /**
     * Naplní seznam alespoň 4 položkami.
     */
    private void naplnSeznam() {
        seznam.add(new Polozka("meloun", 4, "ks"));
        seznam.add(new Polozka("banán", 8, "ks"));
        seznam.add(new Polozka("jablko", 12, "ks"));
        seznam.add(new Polozka("hruška", 2, "ks"));
    }

    /**
     * Vrátí třetí položku ze seznamu.
     *
     * @return
     */
    private Polozka ziskejTretiPolozku() {
        if (seznam.size() >= 3) {
            return seznam.get(2);
        } else {
            return null;
        }
    }

    /**
     * Smaže druhou položku ze seznamu.
     */
    private void smazDruhouPolozku() {
        seznam.remove(1);
    }

    /**
     * Přidá novou položku na konec seznamu.
     */
    private void pridejDalsiPolozku() {
        seznam.add(new Polozka("ananas", 6,"ks"));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nákupní seznam");
        builder.append("\n");
        for (Polozka polozka : seznam) {
            builder.append("* ");
            builder.append(polozka);
            builder.append("\n");
        }
        return builder.toString();
    }
}

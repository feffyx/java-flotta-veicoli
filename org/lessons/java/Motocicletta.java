package org.lessons.java;

public class Motocicletta extends Veicolo {
    private boolean cavalletto;


    public Motocicletta(String targa, int annoImmatricolazione, boolean cavalletto) {
        super(targa, annoImmatricolazione);
        this.cavalletto = cavalletto;
    }

    @Override
    public String toString() {
        return "Motocicletta{" +
                "cavalletto=" + cavalletto +
                '}';
    }
}
package org.lessons.java;

import java.util.ArrayList;
import java.util.List;

public class Flotta {
    private List<Veicolo> veicoli;

    public Flotta() {
        veicoli = new ArrayList<>();
    }

    public void aggiungiVeicolo(Veicolo veicolo) {
        veicoli.add(veicolo);
    }

    public Veicolo trovaVeicolo(String targa) {
        for (Veicolo veicolo : veicoli) {
            if (veicolo.getTarga().equals(targa)) {
                return veicolo;
            }
        }
        return null;
    }

    public int contatore (String tipo) {
        int counter = 0;
        for (Veicolo veicolo : veicoli) {
            if (veicolo instanceof Automobile) {
                counter++;
            } else if (veicolo instanceof Motocicletta) {

            }
        }
        return counter;
    }

    @Override
    public String toString() {
        return "Flotta{" +
                "veicoli=" + veicoli +
                '}';
    }
}
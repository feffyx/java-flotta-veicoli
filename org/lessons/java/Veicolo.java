package org.lessons.java;

import java.util.*;
public abstract class Veicolo {

    private String targa;
    private int annoImmatricolazione;

    public Veicolo(String targa, int annoImmatricolazione) {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
    }
    // getter e setter

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    //METODI

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veicolo veicolo = (Veicolo) o;
        return annoImmatricolazione == veicolo.annoImmatricolazione && Objects.equals(targa, veicolo.targa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targa);
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "targa='" + targa + '\'' +
                ", annoImmatricolazione=" + annoImmatricolazione +
                '}';
    }
}
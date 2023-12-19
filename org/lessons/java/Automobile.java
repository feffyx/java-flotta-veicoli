package org.lessons.java;


public class Automobile extends Veicolo {
    private int porte;

    public Automobile(String targa, int annoImmatricolazione, int porte) {
        super(targa, annoImmatricolazione);
        this.porte = porte;
    }
    // metodi getter e setter per gli attributi

    public int getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    // metodi

    @Override
    public String toString() {
        return "Automobile{" +
                "porte=" + porte +
                '}';
    }
}
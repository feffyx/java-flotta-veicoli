package org.lessons.java;

public class Main {
    public static void main(String[] args) {

        Flotta Flotta = new Flotta();

        Flotta.aggiungiVeicolo(new Automobile("BB123AA", 2020,3));
        Flotta.aggiungiVeicolo(new Motocicletta("BB123BB", 2020, true));
        System.out.println(Flotta);
    }
}
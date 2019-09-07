package io.serializacja;

import java.io.Serializable;

public class Osoba implements Serializable {

    private String imie;
    private int wiek;
    private Adres adres;

    public Osoba(){}


    public Osoba(String imie, int wiek, Adres adres) {
        this.imie = imie;
        this.wiek = wiek;
        this.adres= adres;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek='" + wiek + '\'' +
                '}';
    }
}

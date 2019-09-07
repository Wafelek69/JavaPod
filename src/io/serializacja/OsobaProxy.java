package io.serializacja;

import java.io.Serializable;

public class OsobaProxy implements Serializable {

    String wynik;
    public OsobaProxy(){}

    public OsobaProxy(String wynik) {
        this.wynik = wynik;
    }

    public String getWynik() {
        return wynik;
    }

    public void setWynik(String wynik) {
        this.wynik = wynik;
    }

    @Override
    public String toString() {
        return "OsobaProxy{" +
                "wynik='" + wynik + '\'' +
                '}';
    }
    private Object readResolve() throws Exception{
        String [] tablica = this.wynik.split("::");
        String imie = tablica [0];
        int wiek = Integer.parseInt(tablica[1]);

        return new OsobaProxyPre(imie, wiek);
    }

}

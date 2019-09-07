package io.serializacja;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class OsobaProxyPre implements Serializable {

    private String imie;
    private int wiek;

    public OsobaProxyPre(){}

    public OsobaProxyPre(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
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

    private Object writeReplace() throws ObjectStreamException{
        return new OsobaProxy(imie + "::" + wiek);
    }






    @Override
    public String toString() {
        return "OsobaProxyPre{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }





}



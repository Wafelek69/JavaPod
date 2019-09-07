package io.serializacja;

import java.io.*;

public class OsobaExternlizable  implements Externalizable {

    private String imie;
    private int wiek;


    public OsobaExternlizable(){ }

    public OsobaExternlizable(String imie, int wiek) {
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        String pk = imie + "::"+ wiek;
        out.write(pk.getBytes());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    byte[] bufor = new byte[1024];
        int read = in.read(bufor);
        String zawartosc = new String(bufor, 0 ,read);
        String [] tablica = zawartosc.split("::");
        this.imie = tablica[0];
        this.wiek = Integer.parseInt(tablica[1]);

    }

    @Override
    public String toString() {
        return "OsobaExternlizable{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}

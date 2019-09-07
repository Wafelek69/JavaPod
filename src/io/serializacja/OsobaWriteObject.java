package io.serializacja;

import java.io.*;

public class OsobaWriteObject implements Serializable {

    private transient String imie;
    private transient int wiek;

    public OsobaWriteObject(){}

    public OsobaWriteObject(String imie, int wiek) {
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

    private void writeObject(ObjectOutputStream oos)throws Exception{
        DataOutputStream dos = new DataOutputStream(oos);
        dos.writeUTF(imie + "::" + wiek);
    }

    private void readObject(ObjectInputStream ois) throws Exception{

        DataInputStream dis = new DataInputStream(ois);
        String zawartosc = dis.readUTF();
        String [] tablica = zawartosc.split("::");
        this.imie = tablica[0];
        this.wiek = Integer.parseInt(tablica[1]);

    }


    @Override
    public String toString() {
        return "OsobaWriteObject{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}

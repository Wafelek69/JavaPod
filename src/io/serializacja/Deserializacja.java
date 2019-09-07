package io.serializacja;

import java.io.*;
import java.util.List;

public class Deserializacja {

    public static void main(String[] args) {

        String sciezka = "src/pliki/osoba.bin";
        File plik = new File(sciezka);

        try (InputStream is = new FileInputStream(plik)) {

            ObjectInputStream ois = new ObjectInputStream(is);

            List<Osoba> lista = (List<Osoba>) ois.readObject();

            lista.forEach(i-> System.out.println(i));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

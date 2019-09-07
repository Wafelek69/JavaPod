package io.serializacja.Zadanie;

import java.io.*;
import java.util.List;

public class odczyt {

    public static void main(String[] args) {


        String sciezka = "src/pliki/rodzic.bin";
        File plik = new File(sciezka);

////odczyt
        try (InputStream in = new FileInputStream(plik)){
            ObjectInputStream ois = new ObjectInputStream(in);
            List<Rodzic> lista = (List<Rodzic>)ois.readObject();
            lista.forEach(i->System.out.println(i));// druga pętna for
//            for (Rodzic osoba: lista){
//                System.out.println(osoba);
//            }

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}

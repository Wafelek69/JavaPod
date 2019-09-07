package io.serializacja;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Serializacja {


    public static void main(String[] args) {


        String sciezka = "src/pliki/osoba.bin";
        File plik = new File(sciezka);

        Osoba osoba1 = new Osoba("Lidia",46, new Adres("Częstochowa"));
        Osoba osoba2 = new Osoba("Dawid",27, new Adres("Kraków"));

        List<Osoba> lista = new ArrayList<>();
        lista.add(osoba1);
        lista.add(osoba2);


        try(OutputStream os = new FileOutputStream(plik)){

            ObjectOutputStream ous = new ObjectOutputStream(os);

            ous.writeObject(lista);
            //ous.writeObject(osoba2);



        } catch (IOException e){
            e.printStackTrace();
        }

        try
        {
            System.out.println("Osoba.bin "+ Files.size(Paths.get(sciezka)));
        }catch (IOException e){
            e.printStackTrace();
        }






    }
}

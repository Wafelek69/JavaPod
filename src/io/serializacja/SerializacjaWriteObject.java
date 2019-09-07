package io.serializacja;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializacjaWriteObject {

    public static void main(String[] args) {

        String sciezka = "src/pliki/osoba-write-object.bin";
        File plik = new File(sciezka);

        OsobaWriteObject osoba1 = new OsobaWriteObject("Lidia",46);
        OsobaWriteObject osoba2 = new OsobaWriteObject("David",25);

        try(OutputStream os = new FileOutputStream(plik);){

            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(osoba1);
            oos.writeObject(osoba2);


        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            System.out.println("osoba-write-object.bin" + Files.size(Paths.get(sciezka)));

        }catch(IOException e){
            e.printStackTrace();

        }


    }

}
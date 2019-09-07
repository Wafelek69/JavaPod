package io.serializacja;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SerializacjaExternlizable {

    public static void main(String[] args) {


        String sciezka = "src/pliki/osoba-externlizable.bin";
        File plik = new File(sciezka);

        OsobaExternlizable osoba1 = new OsobaExternlizable("Lidia", 46);
        OsobaExternlizable osoba2 = new OsobaExternlizable("David", 25);


        List<OsobaExternlizable> lista = new ArrayList<>();
        lista.add(osoba1);
        lista.add(osoba2);

        try (OutputStream os = new FileOutputStream(plik);) {

            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(lista);


        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            System.out.println("osoba-externlizable.bin" + Files.size(Paths.get(sciezka)));

        }catch(IOException e){
            e.printStackTrace();

        }

    }
}

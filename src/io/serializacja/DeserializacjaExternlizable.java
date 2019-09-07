package io.serializacja;

import java.io.*;
import java.util.List;

public class DeserializacjaExternlizable {

    public static void main(String[] args) {

        String sciezka = "src/pliki/osoba-externlizable.bin";
        File plik = new File(sciezka);

        try (InputStream is = new FileInputStream(plik)){
            ObjectInputStream ois = new ObjectInputStream(is);
            List<OsobaExternlizable> lista = (List<OsobaExternlizable>)ois.readObject();
            lista.forEach(i->System.out.println(i));
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }




    }
}

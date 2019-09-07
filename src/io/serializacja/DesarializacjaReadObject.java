package io.serializacja;

import java.io.*;

public class DesarializacjaReadObject {

    public static void main(String[] args) {

        String sciezka = "src/pliki/osoba-write-object.bin";
        File plik = new File(sciezka);

        try (InputStream is = new FileInputStream(plik)) {
            ObjectInputStream ois = new ObjectInputStream(is);

            OsobaWriteObject osoba1 = (OsobaWriteObject)ois.readObject();
            System.out.println(osoba1);
            OsobaWriteObject osoba2 = (OsobaWriteObject)ois.readObject();
            System.out.println(osoba2);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }




    }
}

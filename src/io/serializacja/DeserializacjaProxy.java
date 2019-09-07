package io.serializacja;

import java.io.*;
import java.util.List;

public class DeserializacjaProxy {

    public static void main(String[] args) {

        String sciezka = "src/pliki/osoba-proxy.bin";
        File plik = new File(sciezka);

////odczyt
        try (InputStream in = new FileInputStream(plik)){
            ObjectInputStream ois = new ObjectInputStream(in);
            List<OsobaProxyPre> lista = (List<OsobaProxyPre>)ois.readObject();
            //lista.forEach(i->System.out.println(i));// druga petla
            for (OsobaProxyPre osoba: lista){
                System.out.println(osoba);
            }

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }



    }
}

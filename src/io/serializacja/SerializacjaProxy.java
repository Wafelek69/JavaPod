package io.serializacja;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SerializacjaProxy {

    public static void main(String[] args) {

        String sciezka = "src/pliki/osoba-proxy.bin";
        File plik = new File(sciezka);


        OsobaProxyPre osoba1 = new OsobaProxyPre("Lidia",40);
        OsobaProxyPre osoba2 = new OsobaProxyPre("Marcin", 20);

        List<OsobaProxyPre> lista = new ArrayList<>();
        lista.add(osoba1);
        lista.add(osoba2);
        //zapis
        try(OutputStream os = new FileOutputStream(plik)){
            ObjectOutputStream ous = new ObjectOutputStream(os);
            ous.writeObject(lista);

        } catch (IOException e){
            e.printStackTrace();
        }
        try{
            System.out.println("osoba-proxy.bin" + Files.size(Paths.get(sciezka)));

        }catch(IOException e){
            e.printStackTrace();

        }




    }
}

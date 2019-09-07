package streamy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class OdczytBajtów {
    public static <dis> void main(String[] args) {

        String ścieżka = "src/pliki/wejscie.bin.gz";
        try {
            Path path = Paths.get(ścieżka);
            long rozmiar = Files.size(path);
            System.out.println(path+"rozmiar: "+rozmiar);
        }catch (IOException e){
            e.printStackTrace();
        }

        try(InputStream is = new FileInputStream(ścieżka);
            GZIPInputStream gzis = new GZIPInputStream(is);
            DataInputStream dis = new DataInputStream(gzis)){

            List<Integer>lista = new ArrayList<>();
            try{
                while (true){
                    lista.add(dis.readInt());
                }
            }catch (EOFException e){
            }
            System.out.println(lista.size());

        }catch (IOException e){
            e.printStackTrace();
        }

    }


}
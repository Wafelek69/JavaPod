package streamy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.zip.GZIPOutputStream;

public class ZapisBajtów {
    public static void main(String[] args) {

        String ścieżka = "src/pliki/wejscie.bin.gz";
        File plik = new File(ścieżka);

        try (OutputStream os = new FileOutputStream(plik);
             GZIPOutputStream gzos = new GZIPOutputStream(os);
             DataOutputStream dos = new DataOutputStream(gzos);){

            //DataOutputStream dos = new DataOutputStream(os);
            //dos.writeDouble(10);
            //dos.writeUTF("czesć");

            IntStream.range(0,1000).forEach(i->{
                try {
                    dos.writeInt(i);
                }catch (IOException e){
                    e.printStackTrace();
                }
            });


        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            Path path = Paths.get(ścieżka);
            long rozmiar = Files.size(path);
            System.out.println(path + " rozmiar: " + rozmiar);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
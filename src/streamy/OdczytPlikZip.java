package streamy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class OdczytPlikZip {

    public static void main(String[] args) {

        String sciezka = "src/pliki/archiwum.zip";

        try {
            try(InputStream is = new FileInputStream(sciezka);
                ZipInputStream zis = new ZipInputStream(is);
                DataInputStream dis = new DataInputStream(zis)){

                ZipEntry zipEntry = zis.getNextEntry();
                while (zipEntry!=null){
                    if(zipEntry.isDirectory()){
                        System.out.println("Odczyt katalogu: "+ zipEntry);
                    }else {
                        if(zipEntry.getName().endsWith(".bin")){
                            System.out.println("Odczyt pliku "+ zipEntry);
                            List<Integer> lista = new ArrayList<>();
                            try {
                                while (true){
                                    lista.add(dis.readInt());
                                }
                            }catch (EOFException e){
                                e.printStackTrace();
                            }
                            System.out.println("Ilośc elementów : "+ lista.size());
                        } else if (zipEntry.getName().endsWith(".txt")){
                            System.out.println("Odczyt pliku: "+zipEntry);
                            String zawartosc = dis.readUTF();
                            System.out.println("Zawartość pliku: "+zawartosc);
                        }

                    }
                    zipEntry = zis.getNextEntry();

                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

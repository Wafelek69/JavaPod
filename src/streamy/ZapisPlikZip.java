package streamy;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZapisPlikZip {
    public static void main(String[] args) {

        String sciezka = "src/pliki/archiwum.zip";

        try (OutputStream os = new FileOutputStream(sciezka);
             ZipOutputStream zos = new ZipOutputStream(os);
             DataOutputStream dos = new DataOutputStream(zos)){

            ZipEntry dirEntry = new ZipEntry("bin/");
            zos.putNextEntry(dirEntry);

            ZipEntry binFileEntry = new ZipEntry("bin/wejscie.bin");
            zos.putNextEntry(binFileEntry);

            IntStream.range(0,1000).forEach(i->{
                try {
                    dos.writeInt(i);
                }catch (IOException e){
                    e.printStackTrace();
                }
            });

            ZipEntry otherDirEntry = new ZipEntry("tekst/");
            zos.putNextEntry(otherDirEntry);

            ZipEntry textFileEntry = new ZipEntry("tekst/plik.txt");
            zos.putNextEntry(textFileEntry);
            dos.writeUTF("To jakaś zawartość tekstowa");


        }catch (IOException e){
            e.printStackTrace();
        }


    }


}
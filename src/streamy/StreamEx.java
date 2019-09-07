package streamy;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class StreamEx {


    public static void main(String[] args) {


        String sciezka = "src/pliki/archiwumEx.zip";

        OutputStream os= null;

        try {
            os = new FileOutputStream(sciezka);
            ZipOutputStream zos = new ZipOutputStream(os);
            DataOutputStream dos = new DataOutputStream(zos);

            ZipEntry dirEntry = new ZipEntry("imie/");
            zos.putNextEntry(dirEntry);
            ZipEntry imieEntry = new ZipEntry("imie/imie.txt");
            zos.putNextEntry(imieEntry);
            dos.writeUTF("Marcin");
            zos.closeEntry();

            ZipEntry dirEntry2 = new ZipEntry("nazwisko");
            zos.putNextEntry(dirEntry2);
            ZipEntry nazwiskoEntry = new ZipEntry("nazwisko/nazwisko.txt");
            zos.putNextEntry(nazwiskoEntry);
            dos.writeUTF("Wawrzak");
            zos.closeEntry();
            dos.close();


        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if(os != null){
                try{
                    os.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }





    }
}

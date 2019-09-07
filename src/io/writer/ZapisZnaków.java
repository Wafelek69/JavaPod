package io.writer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class ZapisZnaków {

    public static void main(String[] args) {

        Path path = Paths.get("src/pliki/tekst.txt");

//        try(BufferedWriter bw = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE)){
//
//            PrintWriter printWriter = new PrintWriter(bw);
//            printWriter.println("Witaj świecie ");
//
//            Calendar data = GregorianCalendar.getInstance();
//            data.set(1990,1,22);
//            printWriter.printf("Urodziłem się: %1$te %1$tm %1$tY",data);
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }


        BufferedWriter bw =null;
        try{

            bw = Files.newBufferedWriter(path, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
            PrintWriter pw = new PrintWriter(bw);
            pw.println("Witaj świecie");

            Calendar data = GregorianCalendar.getInstance();
            data.set(1990,0,22);
            pw.printf(Locale.GERMANY,"Urodziłem się: %1$te %1$tm %1$tY",data);

        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bw!= null){
                try {
                    bw.flush();//wywoływana automatycznie pod spodem
                    bw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

}






package io;

import javafx.scene.shape.ClosePath;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class ReaderWa {

    public static void main(String[] args) {


        File plik  = new File("src/pliki/czerwony-kapturek.txt");

//        System.out.println(plik.getName());
//        System.out.println(plik.exists());
//
//        File brak = new File("src/pliki/brak.txt");
//        System.out.println(brak.getName());
//        System.out.println(brak.exists());
//
//        brak.createNewFile();
                    //czytanie tekstu
//        try (Reader reader = new FileReader(plik);){
//
//            BufferedReader br = new BufferedReader(reader);
//            String linia = br.readLine();
//            while (linia != null){
//                System.out.println(linia);
//                linia = br.readLine();
//            }
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }
        //////

//        Path path = Paths.get("src/pliki/czerwony-kapturek.txt");
//        try(BufferedReader br = Files.newBufferedReader(path);){
//
//            //br.lines().forEach(i-> System.out.println(i));
//            br.lines().forEach(System.out::println);
//
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }

          //////3 sposób

//        Path path = Paths.get("src/pliki/czerwony-kapturek.txt");
//
//        try (Stream<String> linie = Files.newBufferedReader(path).lines()){
//            linie.forEach(System.out::println);
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//


/////////////////zadanie

       Reader reader = null;

       try{
           reader = new FileReader(plik);
           BufferedReader br = new BufferedReader(reader);
           String linia = br.readLine();
           while (linia != null){
               System.out.println(linia);
               linia = br.readLine();
           }
       } catch (IOException e){
           e.printStackTrace();
       } finally {
           if (reader != null){
               try {
                   reader.close();
               } catch (IOException e){
                   e.printStackTrace();
               }
           }
       }














    }


}

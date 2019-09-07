package com.sda.podstawy;
import java.util.Scanner;
public class bo1 {

    public static void main(String[] args) {

       // System.out.println("Podaj liczbe");
        Scanner skaner = new Scanner(System.in);
        int liczba;

        do
        {
            System.out.println("Podaj liczbe ");
            liczba = skaner.nextInt();
        }
        while (liczba == 0);
        int suma=0;
        int licznik;

        if (liczba > 0 ){
            licznik = 0;
            while (licznik <= liczba){
//                suma - suma + licznik;
//                licznik++;
                suma+=licznik++;

            }
        }
        else
        {
            licznik = liczba;
            while (licznik <=0){
                suma +=licznik ++;
            }
        }


        System.out.println(suma);



    }

}

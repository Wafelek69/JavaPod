package com.sda.podstawy;

import java.util.Scanner;

public class tab4 {

    public static void main(String[] args) {
        int dzielnik = 2;


        System.out.println("Podaj liczbe");
        Scanner skaner = new Scanner(System.in);

        int liczba = skaner.nextInt();
        int licznik = 0;
        int licznikTablicy = 0;
        for (int i = 0; i < liczba; i++) {
            if (i % dzielnik == 0) {
                licznik++;
            }
        }
        int[] tablica = new int[licznik];

        for ( int i = 0; i < liczba; i ++){
            if (i % dzielnik ==0){
                tablica [licznikTablicy] = i;
                licznikTablicy++;
            }
        }

        for (int zmienna: tablica ){
            System.out.println(zmienna);
        }





    }
}

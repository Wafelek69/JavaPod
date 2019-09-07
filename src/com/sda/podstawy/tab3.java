package com.sda.podstawy;

public class tab3 {

    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 5;
        int d = 10;
        int[] tablica = {a, b, c, d};

        int max = tablica[0];
        int min = tablica[0];
        int suma = 0;

        for (int i = 0; i< tablica.length; i++){

            if (tablica[i] > max){
                max = tablica[i];
            }
                if (tablica[i]< min){
                    min = tablica[i];
                }
                suma +=tablica[i];
        }

        System.out.println("Wartosc max " + max);
        System.out.println("Wartosc min " + min);
        System.out.println("Suma " + suma);
        System.out.println("Srednia " + (double) suma / tablica.length);


    }
}

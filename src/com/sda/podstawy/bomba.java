package com.sda.podstawy;

import java.util.Scanner;

public class bomba {
    public static void main(String[] args) {


        Scanner skaner = new Scanner(System.in);
        int liczba;


        do {
            System.out.println("Podaj liczbę dodatnią !!! ");
            liczba = skaner.nextInt();

        }

        while
        (liczba<0);


        System.out.println("Bomba wybuchnie za");
        for (int i = liczba; i >= 0; i--) {

            System.out.println(i);
        }



    }
}

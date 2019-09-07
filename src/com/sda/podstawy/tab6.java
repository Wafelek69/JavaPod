package com.sda.podstawy;

import java.util.Scanner;

public class tab6 {


    public static void main(String[] args) {
        System.out.println( "Podaj liczbe");
        Scanner skaner = new Scanner(System.in);

        int liczba = skaner.nextInt();

        switch (liczba){
            case 10:
                System.out.println("liczba jest rowna 10");
                break;
            case 100:
                System.out.println(" liczba jest rowna 100");
                break;
                default:
                    System.out.println(" Liczba nie jest rowna 10 ani 100");
                    break;
        }







    }
}

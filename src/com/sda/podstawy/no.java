package com.sda.podstawy;
import java.util.Scanner;
public class no {

    public static void main(String[] args) {



        System.out.println("Podaj 2 liczby ");
        Scanner wejscie = new Scanner(System.in);
        int a = wejscie.nextInt();
        int b = wejscie.nextInt();
        int suma  = a+b;
        System.out.println(a+ "+"+b+"="+suma);


    }
}

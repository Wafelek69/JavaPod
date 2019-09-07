package com.sda.podstawy;
import java.util.Scanner;
public class dru {

    public static void main(String[] args) {

        System.out.println("Podaj liczbe ");
        Scanner wejscie = new Scanner(System.in);
        int a = wejscie.nextInt();
        if (a<10){
            System.out.println("Mniejsze od 10*");
        }
        else if (a>10) {
            System.out.println("Wieksze od 10*");
                        }
        else   {
            System.out.println("Równe 10*");
                        }





    }
}

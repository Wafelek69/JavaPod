package com.sda.podstawy;

import java.util.Scanner;

public class tab5 {

    public static void main(String[] args) {


        System.out.println(" Podaj dzialanie ");

        Scanner skaner = new Scanner(System.in);

        int zmiennaLewa = skaner.nextInt();
        char znak = skaner.next().charAt(0);
        int zmiennaPrawa = skaner.nextInt();
        double wynik;

        switch (znak) {

            case '+':
                wynik = zmiennaLewa + zmiennaPrawa;
                break;
            case '-':
                wynik = zmiennaLewa - zmiennaPrawa;
                break;
            case '*':
                wynik = zmiennaLewa * zmiennaPrawa;
                break;
            case '/':
                wynik = zmiennaLewa / zmiennaPrawa;
                break;

            default:
                System.out.println("bledny znak dzialania");
                wynik=0;
        }

        if (zmiennaPrawa == 0 && znak == '/'){
            System.out.println("nie mozna dzielic przez zero");
        } else

        {
            System.out.println("wynik: " + wynik);
        }








    }
}
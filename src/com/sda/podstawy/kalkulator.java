package com.sda.podstawy;

public class kalkulator {
    public static void main(String[] args) {

        double zmienna1 = 150.0;
        double zmienna2 = 50.0;
        double wynik;
        char kod='d';

        if (kod == 'p'){
            wynik = zmienna1 + zmienna2;
            }
        else
            if (kod =='o'){
                wynik = zmienna1 - zmienna2;
            }
        else if (kod =='m'){
                wynik = zmienna1 * zmienna2;
            }
        else if (kod == 'd'){
            wynik = zmienna2!=0 ? zmienna1 /zmienna2 :0.0;
               // wynik = zmienna1 / zmienna2;
            }
        else {
            wynik = 0.0;
            }

        System.out.println(wynik);


    }
}

package com.sda.podstawy;

public class operator {
    public static void main(String[] args) {
        int zmiennaA = 21;
        int zmiennaB = 6;
        int zmiennaC = 3;
        int zmiennaD = 1;

        int wynik1 = zmiennaA - zmiennaB / zmiennaC;
        int wynik2 = (zmiennaA - zmiennaB) / zmiennaC;

        System.out.println(wynik1);
        System.out.println(wynik1);

        int wynik3 = zmiennaA / zmiennaC * zmiennaD + zmiennaB;
        int wynik4 = zmiennaA / zmiennaC * (zmiennaD + zmiennaB);
        System.out.println(wynik3);
        System.out.println(wynik4);


    }
}

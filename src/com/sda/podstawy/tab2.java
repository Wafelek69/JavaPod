package com.sda.podstawy;

public class tab2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 5;
        int d = 10;
        int[] tab = {a, b, c, d};

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println(tab[3]);

        System.out.println("-----");


        for (int i = 0; i < tab.length; i++) {
            System.out.println("wartość tablicy na indeksie " + i + " " + tab[i]);
        }

        System.out.println("------");
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 != 0) {
                System.out.println("liczby o nieparzystym indeksie " + i + " " + tab[i]);
            }


        }

        System.out.println("------");

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                System.out.println("liczby niepatrzyste "  + " " + tab[i]);

            }


        }

        System.out.println("_______________");
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println("wartość tablicy na indeksie " + i + " " + tab[i]);
        }
    }
}
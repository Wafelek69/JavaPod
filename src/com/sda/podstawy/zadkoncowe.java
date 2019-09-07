package com.sda.podstawy;
import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;
public class zadkoncowe {

    public static void main(String[] args) {


        String tab [] = {"kombinerki ", "nożyczki ", "śrubokręt "};


        System.out.println("Podaj imię !");

        Scanner skaner = new Scanner(System.in);
        String imie = skaner.nextLine();

        System.out.println("Witaj " + imie + "! W naszej ofercie mamy: ");
        System.out.print(  tab[0]+"\n" + tab[1]+"\n"+ tab[2]+"\n" +"Co chcesz kupić ? \n");

        Scanner skaner2 = new Scanner(System.in);
        String wybor  = skaner2.nextLine();

        switch (wybor){
            case "kombinerki":
                System.out.println("Kombinerki dostępne w ofercie, dodane do koszyka ");
                tab[0] = "";
                break;
            case "nożyczki":
                System.out.println("Nożyczki dostępne w ofercie, dodane do koszyka ");
                tab [1] = "";
                break;
            case "śrubokręt":
                System.out.println("Srubokret dostępny w ofercie, dodane do koszyka ");
                tab [2] = "";
                break;

                default:
                    System.out.println("Brak produktu w ofercie !");

                        }
        System.out.println("\n \nAktualna lista produktów: ");
            for (int i = 0; i<tab.length; i++)

            System.out.println(tab[i]);





    }
}

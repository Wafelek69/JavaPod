package com.sda.podstawy;

public class tabpetla {

    public static void main(String[] args) {
        boolean a = 6 > 8;
        boolean b = 8 < 9;
        boolean c = (2 - 2) == 0;
        boolean d = 9 % 3 != 0;
        boolean[] tab = {a, b, c, d};

        for (int i = 0; i < tab.length; i++)

            if (tab[i] == true) {
                System.out.println("Prawda");
            }
            else {
                System.out.println("Bład");
            }









    }
}
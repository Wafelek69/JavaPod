package com.sda.podstawy;

public class Metoda {

    public void pokazSume(float x, float y, int licznik){
        if (licznik<1 ){
            System.out.println("Licznik równy 0");
            return;
        }

        float suma = x + y;
        for (int i = 0; i< licznik; i++ )
        {
            System.out.println(suma);
        }



    }

    public static void main(String[] args) {
        Metoda metoda = new Metoda();
        metoda.pokazSume(2, 3, 0);
        System.out.println("Test");

    }
}


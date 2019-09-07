package com.sda.podstawy;

public class rzutowanie {
    public static void main(String[] args) {

        float zmiennaFloat = 1.0f;
        double zmiennaDouble = 4.0d;
        byte zmiennaByte = 7;
        short zmiennaShort = 7;
        long zmiennaLong = 5;

        short wynik1 = zmiennaByte;
        short wynik2 = (short) zmiennaLong;
        short wynik3 = (short) zmiennaByte;

        /* short wynik4 = zmiennaByte-zmiennaLong; */
        short wynik5  = (short) (zmiennaByte-zmiennaLong);
        float wynik6 = zmiennaLong - zmiennaFloat;
        long wynik7 = (long) (zmiennaShort - zmiennaLong + zmiennaFloat + zmiennaDouble);


        System.out.println("Sukces");



    }
}

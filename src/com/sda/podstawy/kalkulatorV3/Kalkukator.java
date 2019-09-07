package com.sda.podstawy.kalkulatorV3;

public class Kalkukator {

    public static void main(String[] args) {
        RownanieMatematyczne [] rownania = new RownanieMatematyczne[4];
        rownania[0]= stworz(100.0d, 50.0d, 'd');
        rownania[1]=stworz(25.0d, 92.0,'p');
        rownania[2]=stworz(225.0d, 17.0d,'o');
        rownania[3]=stworz(11.0,3.0,'m');

        for (RownanieMatematyczne rownanieMatematyczne : rownania){
            rownanieMatematyczne.wykonaj();
            System.out.println("wynik = ");
            System.out.println(rownanieMatematyczne.getWynik());

        }



    }
    public static RownanieMatematyczne stworz (double zmiennaLewa, double zmiennaPrawa, char kod){
        RownanieMatematyczne rownanieMatematyczne = new RownanieMatematyczne();
        rownanieMatematyczne.setZmiennaLewa (zmiennaLewa);
        rownanieMatematyczne.setZmiennaPrawa(zmiennaPrawa);
        rownanieMatematyczne.setKod(kod);
        return  rownanieMatematyczne;
    }

}

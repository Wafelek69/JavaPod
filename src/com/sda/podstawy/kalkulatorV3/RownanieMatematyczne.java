package com.sda.podstawy.kalkulatorV3;

public class RownanieMatematyczne {
    private double zmiennaLewa;
    private double zmiennaPrawa;
    private char kod;
    private double wynik;

    public double getZmiennaLewa(){
        return zmiennaLewa;
    }
    public void setZmiennaLewa(double zmiennaLewa){
        this.zmiennaLewa = zmiennaLewa;

    }
    public double getZmiennaPrawa (){
        return zmiennaPrawa;
    }
    public void setZmiennaPrawa (double zmiennaPrawa){
        this.zmiennaPrawa = zmiennaPrawa;
    }
    public char getKod(){
        return kod;

    }
    public void setKod (char kod){
        this.kod = kod;
    }
    public double getWynik(){
        return wynik;
    }


    public void wykonaj(){
        switch (kod){
            case 'p':
                wynik = zmiennaLewa + zmiennaPrawa;
                break;
            case 'o':
                wynik = zmiennaLewa - zmiennaPrawa;
            case 'm':
                wynik = zmiennaLewa * zmiennaPrawa;
            case 'd':
                wynik = zmiennaPrawa != 0.0 ? zmiennaLewa / zmiennaPrawa : 0.0;
                break;
                default:
                    System.out.println("Blad zly kod");
                    wynik = 0.0;
                    break;
        }
    }

}

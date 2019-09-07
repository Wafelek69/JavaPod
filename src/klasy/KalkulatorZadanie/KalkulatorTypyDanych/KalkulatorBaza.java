package klasy.KalkulatorZadanie.KalkulatorTypyDanych;

public abstract class KalkulatorBaza {

    private double zmiennaLewa;
    private double zmiennaPrawa;
    private double wynik;

    public KalkulatorBaza(){}

    public KalkulatorBaza(double zmiennaLewa, double zmiennaPrawa) {
        this.zmiennaLewa = zmiennaLewa;
        this.zmiennaPrawa = zmiennaPrawa;
    }

    public double getZmiennaLewa() {
        return zmiennaLewa;
    }

    public void setZmiennaLewa(double zmiennaLewa) {
        this.zmiennaLewa = zmiennaLewa;
    }

    public double getZmiennaPrawa() {
        return zmiennaPrawa;
    }

    public void setZmiennaPrawa(double zmiennaPrawa) {
        this.zmiennaPrawa = zmiennaPrawa;
    }

    public double getWynik() {
        return wynik;
    }

    public void setWynik(double wynik) {
        this.wynik = wynik;
    }

    public abstract void oblicz();
















}

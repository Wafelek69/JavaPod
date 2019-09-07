package klasy.KalkulatorZadanie.KalkulatorTypyDanych;

public class Odejmowanie extends KalkulatorBaza {

    public Odejmowanie() { }
    public Odejmowanie(double zmiennaLewa, double zmiennaPrawa) {
        super(zmiennaLewa, zmiennaPrawa);
    }


    @Override
    public void oblicz() {
        double wartosc = getZmiennaLewa() - getZmiennaPrawa();
        setWynik(wartosc);

    }


}
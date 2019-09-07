package klasy.KalkulatorZadanie;

public class Mnożenie extends KalkulatorBaza {

    public Mnożenie() { }

    public Mnożenie(double zmiennaLewa, double zmiennaPrawa) {
        super(zmiennaLewa, zmiennaPrawa);
    }


    @Override
    public void oblicz() {
        double wartosc = getZmiennaLewa() * getZmiennaPrawa();
        setWynik(wartosc);

    }












}

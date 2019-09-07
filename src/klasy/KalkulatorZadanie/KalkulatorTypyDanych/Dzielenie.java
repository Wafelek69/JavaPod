package klasy.KalkulatorZadanie.KalkulatorTypyDanych;

public class Dzielenie extends KalkulatorBaza {


    public Dzielenie() { }

    public Dzielenie(double zmiennaLewa, double zmiennaPrawa) {
        super(zmiennaLewa, zmiennaPrawa);
    }


    @Override
    public void oblicz() {
//        double wartosc = getZmiennaLewa() / getZmiennaPrawa();
//        setWynik(wartosc);

        setWynik(getZmiennaPrawa() !=0 ? getZmiennaLewa() /getZmiennaPrawa() : 0 );

    }











}

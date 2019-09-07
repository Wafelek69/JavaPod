package klasy.KalkulatorZadanie.KalkulatorTypyDanych;

public class Dodawanie extends KalkulatorBaza {

    public Dodawanie(){}
    public Dodawanie(double zmiennaLewa, double zmiennaPrawa){
        super(zmiennaLewa, zmiennaPrawa);
    }


    @Override
    public void oblicz() {
        double wartosc = getZmiennaLewa() + getZmiennaPrawa();
        setWynik(wartosc);

    }
}

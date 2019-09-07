package klasy.KalkulatorZadanie.KalkulatorTypyDanych;

public class KalkulatorPomocnik {

    private static final char DODAWANIE = '+';
    private static final char ODEJMOWANIE = '-';
    private static final char MNOŻENIE = '*';
    private static final char DZIELENIE = '/';

    private KomendaDziałania komendaDziałania;
    private double zmiennaLewa;
    private double zmiennaPrawa;
    private double wynik;


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


    public void przetwarzaj(String działanie) throws NiepoprawneDziałanie{
        String[] częsciDziałania = działanie.split(" ");
        if (częsciDziałania.length !=3){
            throw new NiepoprawneDziałanie("Niepoprawna liczba pól", działanie);
        }


        String komendaDziałaniaString = częsciDziałania[0];

        try {
            zmiennaLewa = Double.parseDouble(częsciDziałania[1]);
            zmiennaPrawa = Double.parseDouble(częsciDziałania[2]);
        } catch (NumberFormatException e){
            throw new NiepoprawneDziałanie("Dane nie są liczbami ", działanie, e);
        }
        ustawKomendeZeString((komendaDziałaniaString));
        if (komendaDziałania== null)
        {
            throw new NiepoprawneDziałanie("Niepoprawny znak działania", działanie);
        }
        KalkulatorBaza kalkulatorBaza = null;

        switch (komendaDziałania) {
            case Dodawanie:
                kalkulatorBaza = new Dodawanie(zmiennaLewa, zmiennaPrawa);
                break;
            case Odejmowanie:
                kalkulatorBaza = new Odejmowanie(zmiennaLewa, zmiennaPrawa);
                break;
            case Mnożenie:
                kalkulatorBaza = new Mnożenie(zmiennaLewa, zmiennaPrawa);
                break;
            case Dzielenie:
                kalkulatorBaza = new Dzielenie(zmiennaLewa, zmiennaPrawa);
                break;
        }
        kalkulatorBaza.oblicz();
        wynik = kalkulatorBaza.getWynik();


    }

    public void ustawKomendeZeString(String komendaDziałaniaString) {
        if (komendaDziałaniaString.equalsIgnoreCase(KomendaDziałania.Dodawanie.toString())) {
            komendaDziałania = komendaDziałania.Dodawanie;
        } else if (komendaDziałaniaString.equalsIgnoreCase(KomendaDziałania.Odejmowanie.toString())) {
            komendaDziałania = komendaDziałania.Odejmowanie;
        } else if (komendaDziałaniaString.equalsIgnoreCase(KomendaDziałania.Mnożenie.toString())) {
            komendaDziałania = komendaDziałania.Mnożenie;
        } else if (komendaDziałaniaString.equalsIgnoreCase(KomendaDziałania.Dzielenie.toString())) {
            komendaDziałania = komendaDziałania.Dzielenie;
        }
    }


    @Override
    public String toString() {
        char znak = ' ';
        switch (komendaDziałania) {
            case Dodawanie:
                znak = DODAWANIE;
                break;
            case Odejmowanie:
                znak = ODEJMOWANIE;
                break;
            case Mnożenie:
                znak = MNOŻENIE;
                break;
            case Dzielenie:
                znak = DZIELENIE;
                break;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(zmiennaLewa);
        sb.append(" ");
        sb.append(znak);
        sb.append(" ");
        sb.append(zmiennaPrawa);
        sb.append(" ");
        sb.append(wynik);
        return sb.toString();
    }


}

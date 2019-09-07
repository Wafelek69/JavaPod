package klasy.KalkulatorZadanie;

public class Main {

    public static void main(String[] args) {

        KalkulatorBaza [] kalkulatorBaza = {
                new Dzielenie(100.0,50.0),
                new Dodawanie(25.0 , 92.0),
                new Odejmowanie(225.0, 17.0),
                new Mnożenie(11.0,3.0)
        };

        for (KalkulatorBaza działanie : kalkulatorBaza){
            działanie.oblicz();
            System.out.println();
            System.out.println("wynik: ");
            System.out.println(działanie.getWynik());

        }











    }



}

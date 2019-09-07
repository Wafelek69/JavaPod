package klasy.KalkulatorZadanie.KalkulatorTypyDanych;

public class Main {

    public static void main(String[] args) {

       String [] działania = {

               "dowanie 1.0",
               "dodawanie xx 25.0",
               "dodawanie 0.0, 0.0",
               "dzielenie 100.0 50.0",
               "dodawanie 25.0 92.0",
               "odejmowanie 225.0 17.0",
               "mnożenie 11.0 3.0",
       };

        KalkulatorPomocnik kalkulatorPomocnik = new KalkulatorPomocnik();
        for (String działanie: działania){
            try {
                kalkulatorPomocnik.przetwarzaj(działanie);
                System.out.println(kalkulatorPomocnik);
            } catch (NiepoprawneDziałanie niepoprawneDziałanie) {
                System.out.println(niepoprawneDziałanie.getMessage());
               if (niepoprawneDziałanie.getCause()!= null){
                   System.out.println("Oryginalny wyjątek "+ niepoprawneDziałanie.getCause().getMessage());
               }
            }

        }



    }



}

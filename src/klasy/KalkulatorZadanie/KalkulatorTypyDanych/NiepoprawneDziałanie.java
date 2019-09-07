package klasy.KalkulatorZadanie.KalkulatorTypyDanych;

public class NiepoprawneDziałanie extends Exception {

    public NiepoprawneDziałanie(String powód, String działanie) {
        super(powód + ": " + działanie);
    }


    public NiepoprawneDziałanie(String powód, String działanie, Throwable przczyna){
        super(powód+ ": "+ działanie, przczyna);
                                                }









}
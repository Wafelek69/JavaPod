package klasy.Zadanie2;

public class UczeńSzkoły extends UczeńKlasy {

    private String nazwaSzkoły;

    public UczeńSzkoły( String nazwaSzkoły) {

        this.nazwaSzkoły = nazwaSzkoły;
    }

    public String getNazwaSzkoły() {
        return nazwaSzkoły;
    }

    public void setNazwaSzkoły(String nazwaSzkoły) {
        this.nazwaSzkoły = nazwaSzkoły;
    }

    @Override
    public String toString() {
        return "UczeńKlasy{" +
                "imie "+
                "nazwisko "+
                "pesel "+

                "nazwaSzkoły='" + nazwaSzkoły + '\'' +
                '}';
    }



}

package klasy.Zadanie2;

public class UczeńKlasy extends Uczeń {

    private int klasa;

    public UczeńKlasy(){}

    public UczeńKlasy( int klasa) {
        this.klasa = klasa;
    }

    public int getKlasa() {
        return klasa;
    }

    public void setKlasa(int klasa) {
        this.klasa = klasa;
    }

    @Override
    public String toString() {
        return "UczeńSzkoły{" +
                "imie "+
                "nazwisko "+
                "pesel "+
                "klasa=" + klasa +
                '}';
    }
}

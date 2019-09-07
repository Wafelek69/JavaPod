package klasy.Zadanie2;

public class Uczeń {

    private String imię;
    private String nazwisko;
    private String pesel;

    public Uczeń(String imię, String nazwisko, String pesel) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public Uczeń(){}


    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Uczeń{" +
                "imię='" + imię + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }


}

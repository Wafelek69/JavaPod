package klasy.Zadanie;



public class Człowiek {

    private String imie;
    private String nazwisko;
    private int wiek;
    private String zawód;

    public Człowiek (String imie, String nazwisko, int wiek, String zawód){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek=wiek;
        this. zawód = zawód;

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getZawód() {
        return zawód;
    }

    public void setZawód(String zawód) {
        this.zawód = zawód;
    }

    public Człowiek() {
    }


    public void chciałbymByć (String args){
         System.out.println("Chciałbym zostać: " + args);

    }
    public void jestem(){
        System.out.println("Jestem człowiekiem ");
    }

    @Override
    public String toString() {
        return "Wywołano konstruktor klasy Człowiek ! "+"Człowiek{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", zawód='" + zawód + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Człowiek marcin = new Człowiek("Marcin", "Kokosz", 30, "Programista");
        Programista zenek = new Programista("Zenek", "Bolek", 30, "Programista", 1, "Java", "Podstawowy");
        JavaDeveloper kokosz = new JavaDeveloper("Kokosz","Kowalski",40,"Programista",10,"Java","Zaawanstowany","Bazdy danych", "spring" );


        System.out.println(marcin);
        System.out.println(zenek);
        System.out.println(kokosz);
        System.out.println("-------------------");
        kokosz.chciałbymByć("Programistą",2);

        marcin.jestem();















    }

}

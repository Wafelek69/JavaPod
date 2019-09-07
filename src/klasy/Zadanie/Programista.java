package klasy.Zadanie;

public class Programista extends Człowiek{

    private int stażPracy;
    private String językProgramowania;
    private String poziom;

    public Programista(String imie, String nazwisko, int wiek, String zawód, int stażPracy, String językProgramowania, String poziom) {
        super(imie, nazwisko, wiek, zawód);
        this.stażPracy = stażPracy;
        this.językProgramowania = językProgramowania;
        this.poziom = poziom;
    }

    @Override
    public void jestem(){
        System.out.println("Jestem programista ");
    }
    @Override
    public String toString() {
        return "Wywołano konstuktor klasy Programista !"+
                "Programista{" +
                "stażPracy=" + stażPracy +
                ", językProgramowania='" + językProgramowania + '\'' +
                ", poziom='" + poziom + '\'' +
                '}';
    }

    public Programista() {
    }

    public int getStażPracy() {
        return stażPracy;
    }

    public void setStażPracy(int stażPracy) {
        this.stażPracy = stażPracy;
    }

    public String getJęzykProgramowania() {
        return językProgramowania;
    }

    public void setJęzykProgramowania(String językProgramowania) {
        this.językProgramowania = językProgramowania;
    }

    public String getPoziom() {
        return poziom;
    }

    public void setPoziom(String poziom) {
        this.poziom = poziom;
    }
}

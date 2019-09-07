package klasy.Zadanie;

public class JavaDeveloper extends Programista{

    private String specjalność;
    private String framework;


    public JavaDeveloper(String imie, String nazwisko, int wiek, String zawód, int stażPracy, String językProgramowania, String poziom, String specjalność, String framework) {
        super(imie, nazwisko, wiek, zawód, stażPracy, językProgramowania, poziom);
        this.specjalność = specjalność;
        this.framework = framework;
    }


    public String getSpecjalność() {
        return specjalność;
    }

    public void setSpecjalność(String specjalność) {
        this.specjalność = specjalność;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }


//    public static void chciałbymByć (int liczba){
//
//        System.out.println("Zostane nim za "+ liczba);
//    }

public void chciałbymByć(String nazwa, int liczba) {
    System.out.println("Chciałbym zostać: " + nazwa);


    if (liczba ==2  || liczba==3||liczba==4)  {
        System.out.println("Zostanę nim za " + liczba + " lata" );


    }if (liczba == 1){
        System.out.println("Zostanę nim za "+ liczba + " rok");
    }

    if (liczba>=5){
        System.out.println("Zostanę nim za " + liczba + " lat" );
    }



    }
@Override
public void jestem(){
    System.out.println("Jestem JavaDeveloperem");
}

    @Override
    public String toString() {
        return "Wywołano konstruktor klasy Java Developer ! "
                +"JavaDeveloper{" +
                "specjalność='" + specjalność + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}








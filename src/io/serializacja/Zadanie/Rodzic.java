package io.serializacja.Zadanie;



import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Rodzic extends Człowiek implements Serializable {


//    private String imie;
//    private String nazwisko;
//    private int wiek;
    //Człowiek dziecko;
    private Człowiek [] dziecko;


    public Rodzic(String imie, String nazwisko, int wiek, Człowiek [] człowiek) {
        super(imie, nazwisko, wiek);//dodane
        this.dziecko = człowiek;

//        super.imie =imie;
//        super.nazwisko = nazwisko;
//        super.wiek = wiek;
    }

    //Usunięte geterry i settery stare


    public Człowiek[] getDziecko() {
        return dziecko;
    }

    public void setDziecko(Człowiek[] dziecko) {
        this.dziecko = dziecko;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rodzic");
        sb.append(" Imie= ");
        sb.append(getImie());
        sb.append(" nazwisko= ");
        sb.append(getNazwisko());
        sb.append(" wiek= ");
        sb.append(getWiek());
        sb.append(" dzieci= ");
        for (Człowiek dziecko : getDziecko()){
            sb.append(dziecko);
        }
        return sb.toString();

    }

    public static void main(String[] args) {

/////////////////ZAPIS DO PLIKU
        String sciezka = "src/pliki/rodzic.bin";
        File plik = new File(sciezka);

        Człowiek [] dzieci1 = {new Człowiek("Jąś", "Kowalski", 10),
                                new Człowiek("Ania", "Nowak",5)};

        Człowiek [] dzieci2 = {new Człowiek("XXXX", "XXX",30),
                new Człowiek("Jąś", "Kowalski", 10),
                new Człowiek("Jąś", "Kowalski", 10)
        };




        Rodzic rodzic1 = new Rodzic("Gienek","Kowalski", 40, dzieci1);
        Rodzic rodzic2 = new Rodzic("Mateusz", "Nowak", 43,dzieci2);

        List<Rodzic> lista = new ArrayList<>();
        lista.add(rodzic1);
        lista.add(rodzic2);

        try(OutputStream os = new FileOutputStream(plik)){
            ObjectOutputStream ous = new ObjectOutputStream(os);
            ous.writeObject(lista);

        } catch (IOException e){
            e.printStackTrace();
        }
        try{
            System.out.println("rodzic.bin.bin" + Files.size(Paths.get(sciezka)));

        }catch(IOException e){
            e.printStackTrace();

        }






    }




}

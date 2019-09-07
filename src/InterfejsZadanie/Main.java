package InterfejsZadanie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner skaner  = new Scanner(System.in);

        System.out.println(" Podaj dwa boki prostokąta");
        double protokątA = skaner.nextDouble();
        double protokątB = skaner.nextDouble();
        System.out.println("Podaj dwie przyprotokątne trójkąta protokątnego ");
        double trójkątA= skaner.nextDouble();
        double trójkątB= skaner.nextDouble();
        System.out.println("Podaj promień koła");
        double kołoR = skaner.nextDouble();


        Prostokąt prostokąt = new Prostokąt(protokątA, protokątB);
        TrójkątProtokątny trójkątProtokątyny = new TrójkątProtokątny(trójkątA, trójkątB);
        Koło koło = new Koło(kołoR);


        Figura[] figury = {prostokąt, trójkątProtokątyny, koło};

        for ( Figura figura  : figury){

            System.out.println(figura);
            System.out.println("pole " + figura.obliczPole());
            System.out.println("obwód "+ figura.obliczObwód());
        }








    }


}

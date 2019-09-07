package com.sda.podstawy;

public class petla_nowa {
    public static void main(String[] args) {

        double[] zmienneLewe = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] zmiennePrawe ={50.0d, 92.0d, 17.0d, 3.0d};
        char[] kodyDzialan={'d','p','o','m'};
        double[]wyniki=new double[kodyDzialan.length];

        for (int i=0; i<kodyDzialan.length; i++) {
            if (kodyDzialan[i] == 'p') {
                wyniki[i] = zmienneLewe[i] + zmiennePrawe[i];
            } else if (kodyDzialan[i] == 'o'){
                wyniki[i]= zmienneLewe [i]- zmiennePrawe[i];
            }else if (kodyDzialan[i] == 'm'){
                wyniki[i]= zmienneLewe[i] * zmiennePrawe[i];
            }else if (kodyDzialan[i] == 'd'){
                wyniki[i]= zmiennePrawe[i] !=0.0d ? zmienneLewe[i]/zmiennePrawe[i] : 0.0d;
            }else {
                System.out.println("Błędny kod");
            }

//        for (int i=0; i<kodyDzialan.length; i++) {
//
//            switch (kodyDzialan[i]){
//
//            case 'p':
//                wyniki[i] = zmienneLewe[i] + zmiennePrawe[i];
//                break;
//            case 'o':
//                wyniki[i]= zmienneLewe [i]- zmiennePrawe[i];
//            }else if (kodyDzialan[i] == 'm'){
//                wyniki[i]= zmienneLewe[i] * zmiennePrawe[i];
//            }else if (kodyDzialan[i] == 'd'){
//                wyniki[i]= zmiennePrawe[i] !=0.0d ? zmienneLewe[i]/zmiennePrawe[i] : 0.0d;
//            }else {
//                System.out.println("Błędny kod");
//            }
//




        }
        for (double wynik : wyniki){
            System.out.println(wynik);
        }








    }
}

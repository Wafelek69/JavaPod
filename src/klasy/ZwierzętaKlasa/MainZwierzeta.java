package klasy.ZwierzętaKlasa;

public class MainZwierzeta {

    public static void main(String[] args) {

        ZwierzeDomowe[] tablicaZwierzat = new ZwierzeDomowe[4];
        tablicaZwierzat[0]= new Pies("sznaucer", 'k');
        tablicaZwierzat[1]= new Kot("pers", 'm');
        tablicaZwierzat[2]= new Kot("dachowie",'m');
        tablicaZwierzat[3]= new Pies("spaniel", 'k');

        for  (ZwierzeDomowe zwierze:tablicaZwierzat){
            System.out.println(zwierze);

            zwierze.dajGłos();


        }




    }
}

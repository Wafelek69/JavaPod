package klasy.ZwierzętaKlasa;

public class Pies extends ZwierzeDomowe {


    public Pies (String rasa, char płeć) {
        super(rasa,płeć);
    }

    @Override
    public void dajGłos() {
        System.out.println("Wooof");

    }


//    public static void main(String[] args) {
//
//        Pies pies = new Pies("owczarek", 'p' );
//        System.out.println(pies.getRasa());
//        System.out.println(pies.getPłeć());
//        System.out.println(pies.getWiek());
//
//        pies.setWiek(3);
//
//        System.out.println(pies.getWiek());
//        //pies.zaszczekaj();
//
//
//    }


}




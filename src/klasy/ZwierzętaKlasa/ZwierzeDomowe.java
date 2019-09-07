package klasy.ZwierzętaKlasa;

public abstract class ZwierzeDomowe {

    private String rasa;
    private int wiek;
    private char płeć;

    private static final char K = 'k';
    private static final char M = 'm';

    public ZwierzeDomowe(String rasa, char płeć) {
        this.rasa = rasa;
        if(płeć == K || płeć == M){
            this.płeć = płeć;
        }
        this.wiek = 0;
        this.płeć = płeć;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public char getPłeć() {
        return płeć;
    }

    public void setPłeć(char płeć) {
        this.płeć = płeć;
    }


    public abstract void dajGłos ();




    @Override
    public String toString() {
        return "ZwierzeDomowe{" +
                "rasa='" + rasa + '\'' +
                ", wiek=" + wiek +
                ", płeć=" + płeć +
                '}';
    }
}

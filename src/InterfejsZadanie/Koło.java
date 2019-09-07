package InterfejsZadanie;

public class Koło implements Figura {


    private double r;


    public Koło(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public double obliczObwód() {
        return 2 * Math.PI * r;
    }


    @Override
    public String toString() {
        return "To jest Koło ";
    }



}


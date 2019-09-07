package InterfejsZadanie;

public class Prostokąt implements Figura{


    private double a;
    private double b;

    public Prostokąt(double x, double y){
        this.a = x;
        this.b = y;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double obliczPole() {
        return a * b;
    }

    @Override
    public double obliczObwód() {
        return 2*a+2*b;
    }

    @Override
    public String toString() {
        return "To jest Prostokąt ";
    }



}

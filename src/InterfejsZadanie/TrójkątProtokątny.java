package InterfejsZadanie;

public class TrójkątProtokątny implements Figura{


    private double a;
    private double b;


    public TrójkątProtokątny(double x, double y){
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
        return 0.5 * a * b;
    }

    @Override
    public double obliczObwód() {
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return a + b +c;
    }

    @Override
    public String toString() {
        return "To jest TrójkątProtokątny ";
    }



}

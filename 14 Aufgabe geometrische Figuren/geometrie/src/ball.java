public class ball extends circle{
    public ball(String name, double r) {
        super(name, r);
    }

    public double getVolume() {
        double x =r*r*r*Math.PI*1.333333333333333333333333333333333;
        return x;
    }
}

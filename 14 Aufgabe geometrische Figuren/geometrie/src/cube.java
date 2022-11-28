public class cube extends rectangle{
    public double c;
    public cube(String name, double a, double b, double c) {
        super(name, a, b);
        this.c=c;

    }

    public double getVolume() {
        return a*b*c;
    }
}

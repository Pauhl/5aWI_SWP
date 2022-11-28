public class rectangle extends quadrat{

    public double b;
    public rectangle(String name, double a, double b) {
        super(name, a);
        this.b=b;



    }

    public double getArea() {
        return b*a;
    }

    public double getSpan() {
        return a*2+b*2;
    }
}

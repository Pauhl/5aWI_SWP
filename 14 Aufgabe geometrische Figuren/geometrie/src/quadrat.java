public class quadrat {
    public double a;
    private String name;

    public quadrat(String name, double a) {
        this.name=name;
        this.a=a;
    }

    public double getArea() {
        return a*a;
    }

    public double getSpan() {
        return a*4;
    }


    public String getName() {
        return name;
    }
}

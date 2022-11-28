public class circle {

    public double r;
    public String name;

    public circle(String name, double r) {
        this.name=name;
        this.r=r;
    }

    public double getArea() {
        return Math.PI*r*r;
    }

    public double getSpan() {
        return 2*r*Math.PI;
    }


    public String getName() {
        return name;
    }
}

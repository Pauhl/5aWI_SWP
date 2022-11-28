public class Main {
    public static void main(String[] args) {

        quadrat quad1= new quadrat("Quadrat", 7);
        System.out.println(quad1.getArea());


        rectangle rec1 = new rectangle("adfj", 100, 30);
        System.out.println(rec1.getSpan());
        System.out.println(rec1.getArea());
        System.out.println(rec1.getName());


        cube cube1 = new cube("hadf", 4,1.2,99);
        System.out.println(cube1.getVolume());
        System.out.println(cube1.getArea());

        circle circ1 = new circle("dsa", 1);
        System.out.println(circ1.getArea());
        System.out.println(circ1.getSpan());


        ball b1 = new ball("fda", 5);
        System.out.println(b1.getName());
        System.out.println(b1.getVolume());


    }
}
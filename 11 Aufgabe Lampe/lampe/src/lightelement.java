public class lightelement {
    String name;
    String color;
    int consumption;
    boolean status;

    public lightelement(String name, String color, int consumption, boolean status) {
        this.name =name;
        this.color=color;
        this.consumption=consumption;
        this.status=status;
    }


    public void turnOn() {
        if (this.status==true) {
            System.out.println("Mein Name ist "+this.name+". Ich bin bereits eingeschaltet");
        }
        else {
            this.status=true;
            this.consumption+=5;
        }
    }
}

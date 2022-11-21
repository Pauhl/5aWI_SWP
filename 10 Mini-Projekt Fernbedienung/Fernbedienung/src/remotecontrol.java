public class remotecontrol  {

    baterry baterry1 = new baterry(100);
    baterry baterry2 = new baterry(100);


    public void poweron() {

        if (baterry1.power>=5 && baterry2.power>=5) {
            baterry1.power-=5;
            baterry2.power-=5;

            System.out.println("Batterie an!");
        }

        else {
            System.out.println("Zu wenig Batterie");
        }

    }

    public void powerinfo() {
        System.out.println("Batteriestand: "+((baterry1.power+baterry2.power)/2));

    }

    public void newbattery() {
        baterry1.power=100;
        baterry2.power=100;

        System.out.println("Batterie ausgewechselt");

    }



}

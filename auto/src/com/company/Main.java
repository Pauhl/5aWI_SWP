package com.company;

public class Main {

    public static void main(String[] args) {

        car auto1 = new car();
        car auto2 = new car();
        engine e1 = new engine();
        engine e2 = new engine();
        tire r1 = new tire();
        r1.confTire("Pirelli", 20, tire.TYPE.SOMMER);

        tire r2 = r1;
        tire r3 = r1;
        tire r4 = r1;


        e1.confEngine(105, engine.TYPE.DIESEL);
        e2.confEngine(180, engine.TYPE.GAS);

        auto1.brand = "Seat";
        auto1.license = "FK274MS";
        auto1.fuel = 70;
        auto1.mileage = 182698;
        auto1.fuelconsumption = 5;

        auto1.confCar("SEAT", "BZ38GHK", 35, 6, 155485,e1);
        auto2.confCar("Mercedes", "DO23TUB", 3, 8, 93591,e2);

        auto1.addTire(r1);
        auto1.addTire(r2);
        auto1.addTire(r3);
        auto1.addTire(r4);


        mirror m1 = new mirror("blue", true);
        mirror m2 = new mirror("blue", false);
        auto1.addMirror(m1, m2);


        auto1.getCarData();
        auto1.drive(50, 100);
        auto2.drive(300, 100);
        auto2.tank(60,2);
        auto2.drive(300, 100);

        auto1.getTireData();


    }
}

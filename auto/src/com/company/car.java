package com.company;


public class car {
    public String brand;
    public String license;
    public int fuel;
    public int fuelconsumption;
    public int mileage;
    public engine engine;
    public tire[] tire;



    public void confCar(String brand, String license, int fuel, int fuelconsumption, int mileage, engine engine) {

        this.brand=brand;
        this.license=license;
        this.fuel=fuel;
        this.fuelconsumption=fuelconsumption;
        this.mileage=mileage;
        this.engine=engine;


    }


    public void getCarData() {

        String data = "Marke: " + brand + "\nKennzeichen: " + license + "\nfuel " + fuel+"\nKilometer:"+mileage+"\nMotorleistung: "+engine.horsePower+"\n";
        System.out.println(data);
    }

    public void drive(int kilometer) {
        if ((this.fuel - (this.fuelconsumption*kilometer*0.01))<0) {
            System.out.println("Tankinhalt zu gering\n");
        }
        else {
            this.fuel = (int) (this.fuel - (this.fuelconsumption * kilometer * 0.01));
            this.mileage = this.mileage + kilometer;

            System.out.println("Zurueckgelegte Kilometer: " + kilometer + "\nVerbleibender Tank:" + this.fuel + "\nNeuer Tachostand:" + this.mileage + "\n");
        }
    }


    public void tank(int gas, int price) {
        this.fuel=gas+this.fuel;

        System.out.println("Neuer Tankstand:"+this.fuel+"\nKosten:"+(gas*price)+"\n");

    }
}
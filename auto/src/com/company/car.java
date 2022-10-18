package com.company;


import java.util.ArrayList;
import java.util.List;

public class car {
    public String brand;
    public String license;
    public int fuel;
    public int fuelconsumption;
    public int mileage;
    public engine engine;
    public List<tire> tire;
    public mirror mirror1;
    public mirror mirror2;


    public car(){
        this.tire=new ArrayList<com.company.tire>();
    }

    public void confCar(String brand, String license, int fuel, int fuelconsumption, int mileage, engine engine) {

        this.brand=brand;
        this.license=license;
        this.fuel=fuel;
        this.fuelconsumption=fuelconsumption;
        this.mileage=mileage;
        this.engine=engine;


    }

    public void addTire(tire tire) {
        this.tire.add(tire);
    }

    public void getTireData() {
        for (tire tire: this.tire
        ) {
            System.out.println("Marke: "+tire.brand+"\nRadius:"+tire.radius+"\n");


        }
    }


    public void getCarData() {

        String spiegel= "nein";
        if (this.mirror1.functional==true && this.mirror2.functional==true) {
            spiegel="ja";
        }
        else {
            spiegel="nein";
        }

        String data = "Marke: " + brand + "\nKennzeichen: " + license + "\nfuel " + fuel+"\nFunktionierende Spiegel:"+spiegel+"\nKilometer:"+mileage+"\nMotorleistung: "+engine.horsePower+"\n";
        System.out.println(data);
    }

    public void drive(int kilometer, int speed) {
        if ((this.fuel - (this.fuelconsumption*kilometer*0.01))<0) {
            System.out.println("Tankinhalt zu gering\n");
        }
        else {
            this.fuel = (int) (this.fuel - (this.fuelconsumption * kilometer * 0.01));
            this.mileage = this.mileage + kilometer;

            System.out.println("Zurueckgelegte Kilometer: " + kilometer + "\nVerbleibender Tank:" + this.fuel + "\nNeuer Tachostand:" + this.mileage + "\nZeit:"+kilometer/speed+"\n");
        }



    }


    public void tank(int gas, int price) {
        this.fuel=gas+this.fuel;

        System.out.println("Neuer Tankstand:"+this.fuel+"\nKosten:"+(gas*price)+"\n");

    }


    public void addMirror(mirror m1, mirror m2) {
        this.mirror1 = m1;
        this.mirror2 = m2;
    }
}
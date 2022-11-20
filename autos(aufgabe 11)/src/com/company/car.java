package com.company;

public class car {
    String color;
    int vmax;
    int listprice;
    int fuelconsumption;
    producer producer;
    engine engine;
    int mileage;
    String model;



    public car(String model, String color, int vmax, int listprice, int fuelconsumption, producer producer, engine engine, int mileage) {
        this.color=color;
        this.vmax=vmax;
        this.listprice=listprice;
        this.fuelconsumption=fuelconsumption;
        this.producer=producer;
        this.engine=engine;
        this.mileage=mileage;
        this.model = model;
    }

    public void buycar() {
        String a=this.producer.name+" "+this.model+" kostet "+this.listprice*(1- producer.discount);

        System.out.println(a);

    }

    public void realmileage() {
        if(this.mileage>=500) {
            System.out.println("Verbrauch: "+ this.fuelconsumption*1.098);

        }

        else {
            System.out.println("Verbrauch: "+ this.fuelconsumption);
        }
    }



}

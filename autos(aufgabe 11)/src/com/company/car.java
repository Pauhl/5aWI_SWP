package com.company;

public class car {
    String color;
    int vmax;
    int listprice;
    int fuelconsumption;
    producer producer;


    public car(String color, int vmax, int listprice, int fuelconsumption, producer producer) {
        this.color=color;
        this.vmax=vmax;
        this.listprice=listprice;
        this.fuelconsumption=fuelconsumption;
        this.producer=producer;
    }

}

package com.company;

public class Truck extends car{
    private String trailer;
    public Truck(engine engine, String brand, String color, String trailer) {
        super(brand, engine, color);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }


    public void iamdriving() {
        System.out.println("I am driving the truck, consumption is high");
    }


}

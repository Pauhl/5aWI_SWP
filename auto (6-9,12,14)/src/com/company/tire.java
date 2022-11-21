package com.company;

public class tire {
    public String brand;
    public int radius;
    public enum TYPE {WINTER, SOMMER};
    public TYPE type;

    public void confTire(String brand, int radius, TYPE type) {
        this.brand=brand;
        this.radius=radius;
        this.type=type;

    }

    public tire(String brand, int radius, TYPE type) {
        this.brand = brand;
        this.radius = radius;
        this.type = type;
    }
}

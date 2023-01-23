package com.company;

public class Heizung implements Observer{
    public int energy;

    @Override
    public void inform() {
        if(energy>=18) {
            System.out.println("Energy is too high");
        }
        else {
            System.out.println("Energy ok");
        }
    }

    public Heizung(int energy) {
        this.energy = energy;
    }
}

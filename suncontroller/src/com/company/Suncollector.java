package com.company;

public class Suncollector implements Observer {
    public void produce() {
        System.out.println("produce Energy");
    }
    public int energy;

    @Override
    public void inform() {

    }
}

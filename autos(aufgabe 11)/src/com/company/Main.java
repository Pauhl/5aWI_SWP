package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        car auto1 = new car("Golf", "blue", 210, 39000, 12, new producer("VW", "Deutschland", 0.07), new engine(120, engine.TYPE.DIESEL), 48000);

        auto1.buycar();

        auto1.realmileage();


    }
}



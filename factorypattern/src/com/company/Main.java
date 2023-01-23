package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Actor> liste = new ArrayList<Actor>();

        RandomActorFactory factory = new RandomActorFactory();

        for(int i=1;i<20; i++) {
            liste.add(factory.getRandomActor());
        }

        liste.get(5).sayHello();
    }
}

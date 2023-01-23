package com.company;

import java.util.ArrayList;
import java.util.Random;

public class RandomActorFactory {

    public Actor getRandomActor() {
        Random rand = new Random();
        int zahl = rand.nextInt(3);
        if(zahl==1) {
            return new bee();
        }
        else if (zahl==2) {
            return new ant();
        }

        else {
            return new wolf();
        }
    }
}

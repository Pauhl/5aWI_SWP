package com.company;

public class engine {
    public enum TYPE {DIESEL, GAS}
    public int horsePower;
    public TYPE type;


    public engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

}


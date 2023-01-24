package com.company;

public class counter {
    private static int count;
    public String name;

    public counter(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }
}

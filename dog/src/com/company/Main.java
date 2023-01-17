package com.company;

public class Main {

    public static void main(String[] args) {
        wuf Wau = new wuf() {
            @Override
            public void bark() {
                System.out.println("wau");
            }
        };

        _dog hund = new _dog("Puddel", "12.02.2023", Wau) {
            @Override
            public void run() {
                System.out.println("Dog is running");
            }


        };
        hund.run();
        hund.bark();

    }
}

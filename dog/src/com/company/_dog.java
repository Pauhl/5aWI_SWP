package com.company;

import java.util.Date;

public abstract class _dog implements Dog, wuf {
    public String name;
    public String birthday;
    public wuf wuf;

    @Override
    public void bark() {
        this.wuf.bark();
    }

    public _dog(String name, String birthday, wuf wuf) {
        this.name = name;
        this.birthday = birthday;
        this.wuf = wuf;
    }
}

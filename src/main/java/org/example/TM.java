package org.example;

public class TM implements Equip {
    @Override
    public Product make(String name) {
        return new Tea(name);
    }
}
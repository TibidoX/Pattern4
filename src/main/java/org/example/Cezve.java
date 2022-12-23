package org.example;

public class Cezve implements Equip {
    @Override
    public Product make(String name) {
        return new Coffee(name);
    }
}
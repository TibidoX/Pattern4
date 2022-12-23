package org.example;

public class CM implements Equip {
    @Override
    public Product make(String name) {
        return new Coffee(name);
    }
}

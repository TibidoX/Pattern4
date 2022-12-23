package org.example;

public class Samovar implements Equip {
    @Override
    public Product make(String name) {
        return new Tea(name);
    }
}

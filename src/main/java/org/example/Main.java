package org.example;

public class Main {
    public static void main(String[] args) {
        Welding facade = new Welding();

        System.out.println(facade.weld("Samovar", "Black").getName());
        System.out.println(facade.weld("Coffee machine", "Americano").getName());
    }
}
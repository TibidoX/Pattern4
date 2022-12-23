package org.example;

public class EquipFactory {
    public static Equip factory(String type) {
        return switch (type) {
            case "Tea machine" -> new TM();
            case "Samovar" -> new Samovar();
            case "Coffee machine" -> new CM();
            case "Cezve" -> new Cezve();
            default -> throw new RuntimeException("Not found equipment");
        };
    }
}
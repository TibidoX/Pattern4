package org.example;

public class Welding {
    public Product weld(String type, String productName) {
        Equip equipment = EquipFactory.factory(type);
        Product product = equipment.make(productName);

        if (product instanceof Tea) {
            product.addIngredient("Sugar");
        }

        if (product instanceof Coffee) {
            product.addIngredient("Milk");
        }

        return product;
    }
}

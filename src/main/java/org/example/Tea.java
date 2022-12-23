package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tea implements Product {
    private final String name;
    private final List<String> ingredients;

    public Tea(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    @Override
    public String getName() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tea ").append(name).append('[');
        for (int i = 0; i < ingredients.size(); i++) {
            builder.append(ingredients.get(i)).append(',');
        }
        builder.append(']');

        return builder.toString();
    }

    @Override
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }
}
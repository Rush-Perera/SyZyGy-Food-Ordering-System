/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.flyweight;

import java.util.HashMap;
import java.util.Map;
import syzygy.model.Ingredient;

/**
 *
 * @author Sudeera Perera
 */
public class IngredientFlyweightFactory {
    private static Map<String, Ingredient> ingredientMap = new HashMap<>();

    public static Ingredient getIngredient(String name) {
        if (!ingredientMap.containsKey(name)) {
            ingredientMap.put(name, new Ingredient(name));
        }
        return ingredientMap.get(name);
    }
}

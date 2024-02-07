/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.builder;

import syzygy.model.FoodItem;
import syzygy.model.Order;

/**
 *
 * @author Sudeera Perera
 */
public class OrderBuilder {
    
    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public OrderBuilder addFoodItem(FoodItem foodItem, int quantity) {
        this.order.addFoodItem(foodItem, quantity);
        return this;
    }


    public Order build() {
        return this.order;
    }
}

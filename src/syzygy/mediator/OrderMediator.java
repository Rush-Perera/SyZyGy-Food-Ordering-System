/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.mediator;

import syzygy.communication.OrderManager;
import syzygy.model.Customer;
import syzygy.model.Order;

/**
 *
 * @author Sudeera Perera
 */
public class OrderMediator {
    private Customer customer;
    private OrderManager orderManager;

    public OrderMediator(Customer customer, OrderManager orderManager) {
        this.customer = customer;
        this.orderManager = orderManager;
    }

    public void placeOrder(Order order) {
        // Handle communication and order placement
        orderManager.processOrder(order, customer);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.communication;

import syzygy.database.DatabaseManager;
import syzygy.model.Customer;
import syzygy.model.Order;
import syzygy.model.OrderStatus;

/**
 *
 * @author Sudeera Perera
 */
public class OrderManager {
      private DatabaseManager databaseManager;

    public OrderManager(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void processOrder(Order order, Customer customer) {
        // Handle the order processing steps
        acceptOrder(order);
        cookOrder(order);
        packOrder(order);
        handoverToDriver(order);

        // Update order status in the database
        databaseManager.updateOrderStatus(order.getId(), OrderStatus.HANDOVER);

        // Communicate the order status to the customer
//        communicationSystem.communicateWithCustomer(customer, "Your order is ready for delivery!");
    }

    private void acceptOrder(Order order) {
        // Implement logic for accepting the order
        databaseManager.updateOrderStatus(order.getId(), OrderStatus.ACCEPTED);
    }

    private void cookOrder(Order order) {
        // Implement logic for cooking the order
        databaseManager.updateOrderStatus(order.getId(), OrderStatus.COOKING);
    }

    private void packOrder(Order order) {
        // Implement logic for packing the order
        databaseManager.updateOrderStatus(order.getId(), OrderStatus.PACKING);
    }

    private void handoverToDriver(Order order) {
        // Implement logic for handing over the order to the driver
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.chainofresponsibility;

import syzygy.model.Order;

/**
 *
 * @author Sudeera Perera
 */
public interface OrderProcessHandler {
    void handleOrder(Order order);
    void setNextHandler(OrderProcessHandler nextHandler);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.controller;

import syzygy.builder.OrderBuilder;
import syzygy.communication.CommunicationSystem;
import syzygy.database.DatabaseManager;
import syzygy.interpreter.CommandInterpreter;
import syzygy.mediator.OrderMediator;

/**
 *
 * @author Sudeera Perera
 */
public class OrderController {
    private OrderBuilder orderBuilder;
    private CommandInterpreter commandInterpreter;
    private OrderMediator orderMediator;
    private CommunicationSystem communicationSystem;
    private DatabaseManager databaseManager;
}

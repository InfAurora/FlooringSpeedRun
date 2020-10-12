package com.speedrun.flooringco.controller;

import com.speedrun.flooringco.ui.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.speedrun.flooringco.enums.UserOption.Option;
import com.speedrun.flooringco.service.ServiceImpl;

@Component
public class Controller {
    
    private ServiceImpl service;
    private View view;

    @Autowired
    public Controller(ServiceImpl service, View view) {
        this.service = service;
        this.view = view;
    }

    public void run() {
        Boolean runAgain = true;
        view.displayChoices();
        Option userOption = null;
        while(runAgain) {
            userOption = view.getUsersOptionChoice();
            switch (userOption) {
                case ONE:
                System.out.println("hello");
                    // displayOrders();
                    break;
                case TWO:
                    // addOrder();
                    break;
                case THREE:
                    // editOrder();
                    break;
                case FOUR:
                    // removeOrder();
                    break;
                case FIVE:
                    // exportAllOrders();
                    break;
                case SIX:
                     runAgain = false;
                     // exitMessage();
                    break;
                default:
                    // throw exception that says not a valid choice
                    break;
            }
        }
    }

}
package com.speedrun.flooringco.controller;

import com.speedrun.flooringco.ui.UserConsole;
import com.speedrun.flooringco.ui.UserConsoleImpl;
import com.speedrun.flooringco.ui.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.speedrun.flooringco.service.ServiceImpl;

@Component
public class Controller {
    
    private ServiceImpl service;
    private View view;
    private UserConsole io = new UserConsoleImpl();

    @Autowired
    public Controller(ServiceImpl service, View view) {
        this.service = service;
        this.view = view;
    }

    public void run() {
        io.print("Wow I got this set up in Vs Code!!!!");
    }
}
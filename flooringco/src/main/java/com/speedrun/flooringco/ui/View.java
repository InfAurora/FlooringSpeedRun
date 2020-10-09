package com.speedrun.flooringco.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class View {
    
    private UserConsole io;

    @Autowired
    public View(UserConsole io) {
        this.io = io;
    }
}

package com.speedrun.flooringco.ui;

import com.speedrun.flooringco.enums.UserOption;
import com.speedrun.flooringco.enums.UserOption.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class View {
    
    private UserConsole io;

    @Autowired
    public View(UserConsole io) {
        this.io = io;
    }

    public void displayChoices() {
        io.print("    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        io.print("*  <<Flooring Program>>");
        io.print("* 1. Display Orders");
        io.print("* 2. Add an Order");
        io.print("* 3. Edit an Order");
        io.print("* 4. Remove an Order");
        io.print("* 5. Export All Data");
        io.print("* 6. Quit");
        io.print("*");
        io.print("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }

    public Option getUsersOptionChoice() {
        int usersOption = io.readInt("Choose an option: ");
        switch (usersOption) {
            case 1:
                return Option.ONE;
            case 2:
                return Option.TWO;
            case 3:
                return Option.THREE;
            case 4:
                return Option.FOUR;
            case 5:
                return Option.ONE;
            case 6:
                return Option.ONE;
            default:
                return null;
        }
    }
}

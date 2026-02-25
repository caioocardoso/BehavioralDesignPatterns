package org.caioocardoso.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartHouseApp {
    private HashMap<String, SmartHouseCommand> commands = new HashMap<>();

    public void addCommand(String key, SmartHouseCommand command){
        this.commands.put(key, command);
    }

    public void executeCommand(String key){
        SmartHouseCommand command = this.commands.get(key);
        command.execute();
    }

    public void undoCommand (String key){
        SmartHouseCommand command = this.commands.get(key);
        command.undo();
    }
}

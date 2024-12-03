package org.example.Command;

import java.util.Stack;

public class CommandManager {
    private final Stack<Command> executedCommands = new Stack<>();
    private final Stack<Command> undoneCommands = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        executedCommands.push(command);
        undoneCommands.clear();
    }

    public void undo() {
        if (!executedCommands.isEmpty()) {
            Command command = executedCommands.pop();
            command.undo();
            undoneCommands.push(command);
        } else {
            System.out.println("Brak operacji do cofnięcia.");
        }
    }

    public void redo() {
        if (!undoneCommands.isEmpty()) {
            Command command = undoneCommands.pop();
            command.execute();
            executedCommands.push(command);
        } else {
            System.out.println("Brak operacji do ponowienia.");
        }
    }
}

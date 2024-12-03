package org.example.Command;

import org.example.Model.Task;

import java.util.List;

public class DeleteTaskCommand implements Command {
    private Task task;
    private List<Task> tasks;

    public DeleteTaskCommand(Task task, List<Task> tasks) {
        this.task = task;
        this.tasks = tasks;
    }

    @Override
    public void execute() {
        tasks.remove(task);
        System.out.println("Zadanie usunięte: " + task.getTitle());
    }

    @Override
    public void undo() {
        tasks.add(task);
        System.out.println("Cofnięto usunięcie zadania: " + task.getTitle());
    }
}


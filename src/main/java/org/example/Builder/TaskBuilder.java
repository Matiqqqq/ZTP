package org.example.Builder;

import org.example.Model.Priority;
import org.example.Model.Task;

import java.util.Date;
import java.util.UUID;

public class TaskBuilder {
    private UUID id = UUID.randomUUID();
    private String title = "Domyślny tytuł";
    private String description = "";
    private Priority priority = Priority.MEDIUM;
    private Date endDate = new Date();
    private String category = "OTHER";
    private boolean isCompleted = false;

    public TaskBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public TaskBuilder setPriority(Priority priority) {
        this.priority = priority;
        return this;
    }

    public TaskBuilder setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public TaskBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    public TaskBuilder setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
        return this;
    }

    public Task build() {
        return new Task(id, title, description, priority, endDate, category, isCompleted);
    }
}

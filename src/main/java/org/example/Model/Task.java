package org.example.Model;

import java.util.UUID;
import java.util.Date;

public class Task {
    private final UUID id;
    private final String title;
    private final String description;
    private final Priority priority;
    private final Date endDate;
    private final String category;
    private final boolean isCompleted;

    public Task(UUID id, String title, String description, Priority priority, Date endDate, String category, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.endDate = endDate;
        this.category = category;
        this.isCompleted = isCompleted;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getCategory() {
        return category;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", endDate=" + endDate +
                ", category='" + category + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}


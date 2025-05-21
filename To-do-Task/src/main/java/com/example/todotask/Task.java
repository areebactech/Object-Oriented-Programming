package com.example.todotask;

import java.time.LocalDate;

public class Task {
    private int id;
    private String title;
    private String description;
    private LocalDate deadline;
    private String priority;
    private String category;
    private String status;

    // Constructor without ID (for new tasks)
    public Task(String title, String description, LocalDate deadline, String priority, String category, String status) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.category = category;
        this.status = status;
    }

    // Constructor with ID (for reading from database)
    public Task(int id, String title, String description, LocalDate deadline, String priority, String category, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.category = category;
        this.status = status;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // For displaying in ListView (optional, useful for debugging)
    @Override
    public String toString() {
        return "[" + priority + "] " + title + " (Due: " + deadline + ") - " + status;
    }
}


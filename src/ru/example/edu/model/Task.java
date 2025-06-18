package ru.example.edu.model;

import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate date;
    private int priority;
    private String detailing;

    public Task(String name, LocalDate date, int priority, String detailing) {
        this.name = name;
        this.date = date;
        this.priority = priority;
        this.detailing = detailing;
    }

    @Override
    public String toString() {
        return "name: " + name + ", date: " + date + ", priority: " + priority + ", detailing: " + detailing;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getPriority() {
        return priority;
    }

    public String getDetailing() {
        return detailing;
    }
}

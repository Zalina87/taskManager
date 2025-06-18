package ru.example.edu;

import ru.example.edu.model.Task;
import ru.example.edu.service.TaskService;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task taskOne = new Task("сделать ренген",
                LocalDate.of(2025, 7, 2),
                1,
                "уточнить время приема");
        Task taskTwo = new Task("записаться к ортодонту",
                LocalDate.of(2025, 7, 3),
                1,
                "после 17-00");
        System.out.println(taskOne);
        Task[] tasks = {taskOne, taskTwo};
        TaskService taskService = new TaskService(tasks);
        System.out.println(Arrays.toString(taskService.findByPriority(1)));
    }
}

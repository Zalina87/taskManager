package ru.example.edu.service;

import ru.example.edu.model.Task;

public class TaskService {
    private Task[] listTask;

    public TaskService(Task[] listTask) {
        this.listTask = listTask;
    }

    public Task[] findByPriority(int priority) {
        Task[] tmp = new Task[listTask.length];
        int j = 0;

        for (int i = 0; i < listTask.length; i++) {
            if (listTask[i].getPriority() == priority) {
                tmp[j] = listTask[i];
                j++;
            }
        }

        Task[] result = new Task[j];
        System.arraycopy(tmp, 0, result, 0, j);
        return result;
    }
}

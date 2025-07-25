package cl.kibernumacademy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import cl.kibernumacademy.model.Task;

public class TaskTracker {
  private List<Task> tasks;

  public TaskTracker() {
    this.tasks = new ArrayList<>();
  }

  public void addTask(Task task) {
    tasks.add(Objects.requireNonNull(task, "task no puede ser null"));
  }

  public void markTaskAsCompleted(Task task) {
    tasks.stream()
        .filter(t -> t.equals(task))
        .findFirst()
        .ifPresent(Task::markAsCompleted);
  }

  public List<Task> getTasks() {
    return List.copyOf(tasks);
  }

  public List<Task> getPendingTasks() {
    return tasks.stream()
        .filter(task -> !task.isCompleted())
        .collect(Collectors.toList());
  }

}

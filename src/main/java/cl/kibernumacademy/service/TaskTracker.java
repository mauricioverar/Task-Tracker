package cl.kibernumacademy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import cl.kibernumacademy.model.Task;

public class TaskTracker {
  private List<Task> tasks;

  public TaskTracker() {
    this.tasks = new ArrayList<>();
  }

  public void addTask(Task task) {
    tasks.add(task);
  }

  public void markTaskAsCompleted(Task task) {
    if (tasks.contains(task)) {
      task.markAsCompleted();
    }
  }

  public List<Task> getTasks() {
    return tasks;
  }

  public List<Task> getPendingTasks() {
    return tasks.stream()
                .filter(task -> !task.isCompleted())
                .collect(Collectors.toList());
  }

}

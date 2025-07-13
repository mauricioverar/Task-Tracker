package cl.kibernumacademy.service;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import cl.kibernumacademy.model.Task;

public class TaskTrackerTest {
  private TaskTracker taskTracker;

  @BeforeEach
  public void setUp() {
    taskTracker = new TaskTracker();
  }

  @AfterEach
  public void tearDown() {
    taskTracker = null;
  }

  @Test//
  void testAgregarTarea__deberiaAgregarTareaALaLista() {
    Task tarea = new Task("Tarea 1", "Descripción de la tarea 1");
    taskTracker.addTask(tarea);
    assert taskTracker.getTasks().contains(tarea) : "La tarea no fue agregada correctamente";
  }

  @Test
  void testMarcarTareaComoCompletada__deberiaMarcarTareaComoCompletada() {
    Task tarea = new Task("Tarea 2", "Descripción de la tarea 2");
    taskTracker.addTask(tarea);
    taskTracker.markTaskAsCompleted(tarea);
    assert tarea.isCompleted() : "La tarea no fue marcada como completada correctamente";
  }
 
  @Test
  void testListarTareasPendientes__deberiaListarSoloTareasPendientes() {
    Task tarea1 = new Task("Tarea 3", "Descripción de la tarea 3");
    Task tarea2 = new Task("Tarea 4", "Descripción de la tarea 4");
    taskTracker.addTask(tarea1);
    taskTracker.addTask(tarea2);
    taskTracker.markTaskAsCompleted(tarea1);

    List<Task> tareasPendientes = taskTracker.getPendingTasks();
    assertThat(tareasPendientes, hasItem(tarea2));
    assertThat(tareasPendientes, not(hasItem(tarea1)));
  }

  @Test
  void afirmacionesConHamcrest() {
    Task tarea = new Task("Tarea 5", "Descripción de la tarea 5");
    taskTracker.addTask(tarea);
    
    assertThat(taskTracker.getTasks(), hasItem(tarea));
    assertThat(tarea.isCompleted(), is(false));

    taskTracker.markTaskAsCompleted(tarea);

    assertThat(tarea.isCompleted(), is(true));
  }

  @ParameterizedTest
  @ValueSource(strings = { "Tarea 6", "Tarea 7", "Tarea 8" })
  void testAgregarTareaConParametros(String nombreTarea) {
    Task tarea = new Task(nombreTarea, "Descripción de " + nombreTarea);
    taskTracker.addTask(tarea);
    assert taskTracker.getTasks().contains(tarea) : "La tarea " + nombreTarea + " no fue agregada correctamente";
  }

  // assume
  @Test
  void testAsumirQueLaListaDeTareasNoEstaVacia() {
    Task tarea = new Task("Tarea 9", "Descripción de la tarea 9");
    taskTracker.addTask(tarea);
    assert !taskTracker.getTasks().isEmpty() : "La lista de tareas debería contener al menos una tarea";
  }



}

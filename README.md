# 📝 Task Tracker Test

Este repositorio contiene las pruebas unitarias para la clase `TaskTracker`, que forma parte de una aplicación sencilla de gestión de tareas (`cl.kibernumacademy`). Las pruebas están escritas utilizando **JUnit 5** junto con **Hamcrest** para afirmaciones más expresivas.

## 🧪 Descripción de las Pruebas

La clase `TaskTrackerTest` verifica el correcto funcionamiento de las funcionalidades principales del sistema de gestión de tareas:

- Agregar tareas.
- Marcar tareas como completadas.
- Listar tareas pendientes.
- Uso de parámetros dinámicos en pruebas.
- Validación de condiciones previas (assumptions).

## 🛠️ Requisitos

- Java 17 o superior
- JUnit Jupiter API y Engine (JUnit 5)
- Hamcrest (para afirmaciones avanzadas)

### 📦 Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── cl.kibernumacademy/
│   │       ├── model/Task.java
│   │       └── service/TaskTracker.java
│   └── resources/
└── test/
    └── java/
        └── cl.kibernumacademy/
            └── service/
                └── TaskTrackerTest.java
```

## 🚀 Ejecutar las Pruebas

### Con Maven:
```bash
mvn test
```

## 📎 Notas Adicionales

- Se utiliza `@BeforeEach` y `@AfterEach` para inicializar y limpiar el entorno de prueba antes y después de cada método de prueba.
- El uso de `assertThat` con Hamcrest mejora la claridad de los mensajes de error en las pruebas.
- Las pruebas parametrizadas ayudan a reducir la duplicación de código cuando se prueba el mismo comportamiento con distintas entradas.

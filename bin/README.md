# **Prueba Técnica: Sistema de Gestión de Tareas**

### **Objetivo**  
Implementar una API REST para gestionar tareas de un usuario.

---

## **Requisitos Funcionales**

Un usuario debe poder realizar las siguientes acciones:  

1. **Crear una tarea** con un título y descripción.  
2. **Marcar una tarea como completada.**  
3. **Obtener una lista de todas las tareas.**  
4. **Eliminar una tarea por su ID.**  

---

## **Requisitos Técnicos**

1. Utilizar **Java 17** o superior.  
2. Utilizar **Spring Boot 3+**.  
3. Persistencia opcional:
   - **H2 en memoria**.
   - O un **repositorio en memoria** si no se prefiere persistencia.
4. Implementar validaciones básicas:
   - **Título** obligatorio y con un máximo de 100 caracteres.
   - **Descripción** opcional.
5. Utilizar `@RestController` para exponer los endpoints.  
6. (Opcional) Implementar pruebas unitarias básicas con **JUnit**.

---

## **Requisitos No Funcionales**

1. Código legible, modular y organizado.  
2. Manejo básico de errores:
   - Por ejemplo, si se intenta acceder o eliminar una tarea que no existe.  
3. Documentación básica de los endpoints (comentarios o uso de **Swagger**).

---

## **Detalles del Desarrollo**

### **Modelo: Task**
```java
public class Task {
    private Long id;
    private String title;
    private String description;
    private boolean completed;

    // Getters y Setters
}
```

---

### **Endpoints Requeridos**

| Método  | Endpoint            | Descripción                       | Ejemplo de Request Body         |
|---------|---------------------|-----------------------------------|----------------------------------|
| `POST`  | `/tasks`            | Crear una nueva tarea            | `{ "title": "Comprar leche", "description": "Ir al supermercado" }` |
| `GET`   | `/tasks`            | Obtener todas las tareas         | N/A                              |
| `PUT`   | `/tasks/{id}/done`  | Marcar una tarea como completada | N/A                              |
| `DELETE`| `/tasks/{id}`       | Eliminar una tarea por su ID      | N/A                              |

---

## **Evaluación**

### **Criterios para Nivel Junior**

1. **Correcto uso de Spring Boot:**  
   - Anotaciones como `@RestController`, `@Service`, `@Repository`.  
2. **Implementación básica de lógica:**  
   - Crear, listar, actualizar y eliminar tareas.  
3. **Persistencia opcional:**  
   - Uso de H2 o un repositorio en memoria.  

---

### **Puntos Adicionales**

1. **Pruebas Unitarias:**  
   - Uso de **JUnit** y **Mockito** para probar servicios y controladores.  
2. **Documentación de Endpoints:**  
   - Uso de **Swagger/OpenAPI** para describir los endpoints.  
3. **Validaciones Correctas:**  
   - Por ejemplo, título obligatorio con máximo de 100 caracteres.  

---

## **Sugerencias para Evaluadores**

1. **Tiempo estimado:** 2-3 horas para un desarrollador junior.  
2. **Puntaje:**  
   - Claridad del código.  
   - Manejo de errores.  
   - Uso de buenas prácticas (como diseño por capas).  
   - Implementación correcta de Spring Boot.

---

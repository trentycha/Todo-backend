package fr.lents.go.controller;

import fr.lents.go.dto.TodoItemDto;
import fr.lents.go.service.TodoService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
@Path("/todo")
public class TodoController {

    public final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TodoItemDto> getallTodo() {
        return todoService.getAll();
    }
}



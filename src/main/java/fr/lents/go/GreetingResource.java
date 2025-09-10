package fr.lents.go;

import fr.lents.go.dto.TodoItemDto;
import fr.lents.go.repository.TodoRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.ArrayList;

@Path("/hello")
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoItemDto> getAll() {
        List<TodoItemDto> result = new ArrayList<>();

        todoRepository.findAll().forEach(todoItem -> result.add(new TodoItemDto(todoItem.getId(), todoItem.getText(), todoItem.isCompleted())));

                return result;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
}

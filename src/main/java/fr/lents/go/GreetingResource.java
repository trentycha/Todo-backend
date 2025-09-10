package fr.lents.go;

import fr.lents.go.dto.TodoItemDto;
import fr.lents.go.repository.TodoRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoDTO> getAll() {
        List<TodoDTO> result = new ArrayList<>();

        todoRepository.finAll().forEach(todo -> result.add(new TodoDTO(todo.getId(), todo.getText, todo.isCompleted)))

                return result;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
}

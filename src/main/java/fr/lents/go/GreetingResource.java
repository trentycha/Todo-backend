package fr.lents.go;

import fr.lents.go.dto.TodoItemDto;
import fr.lents.go.repository.TodoRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private final TodoRepository todoRepository;

    public GreetingResource(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }



    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
}

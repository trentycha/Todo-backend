package fr.lents.go.service;

import fr.lents.go.dto.TodoItemDto;
import fr.lents.go.entity.TodoItem;
import fr.lents.go.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static jdk.internal.agent.Agent.getText;
import static org.jboss.tm.TxUtils.isCompleted;
import static sun.security.pkcs11.wrapper.Functions.getId;

@Service
public class TodoService {

private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


public List<TodoItemDto> getAll() {

        List<TodoItemDto> tasks = new ArrayList<>();
        todoRepository.findAll().forEach(item -> tasks.add(new TodoItemDto(item.getId(), item.getText(), item.isCompleted())));

    return tasks;
}

}
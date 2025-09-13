package fr.lents.go.service;

import fr.lents.go.dto.TodoItemDto;
import fr.lents.go.entity.TodoItem;
import fr.lents.go.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoItemDto> getAll() {
        List<TodoItemDto> result = new ArrayList<>();
        todoRepository.findAll().forEach(item -> result.add(new TodoItemDto(item.getId(), item.getText(), item.isCompleted())));
        return result;
    }
}
package fr.lents.go.repository;

import fr.lents.go.entity.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<TodoItem, Long> {
}

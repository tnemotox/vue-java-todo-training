package sandbox.domain.service;

import sandbox.domain.model.Todo;
import sandbox.domain.model.TodoList;

public interface ITodoService {

    TodoList findAll();

    int create(Todo todo);

    int update(int id, Todo todo);

    int delete(int id);
}

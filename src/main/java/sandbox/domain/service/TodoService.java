package sandbox.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sandbox.domain.model.Todo;
import sandbox.domain.model.TodoList;

@Service
@RequiredArgsConstructor
public class TodoService implements ITodoService {

    @Override
    public TodoList findAll() {
        return null;
    }

    @Override
    public int create(Todo todo) {
        return 0;
    }

    @Override
    public int update(int id, Todo todo) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}

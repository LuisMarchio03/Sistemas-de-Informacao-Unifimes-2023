package service;

import model.Todo;
import repository.TodoRepository;

import java.util.List;

public class TodoService {
    private TodoRepository todoRepository;

    public TodoService() {
        this.todoRepository = new TodoRepository();
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(int id) {
        return todoRepository.findById(id);
    }

    public Todo addTodo(String description) {
        Todo newTodo = new Todo();
        newTodo.setDescription(description);
        return todoRepository.save(newTodo);
    }

    public boolean deleteTodoById(int id) {
        return todoRepository.deleteById(id);
    }

    public boolean markTodoAsCompleted(int id) {
        Todo todo = getTodoById(id);
        if (todo != null) {
            todo.setCompleted(true);
            return todoRepository.update(todo);
        }
        return false;
    }
}

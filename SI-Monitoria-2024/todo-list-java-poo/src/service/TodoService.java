package service;

import java.util.ArrayList;
import java.util.List;

import model.Todo;

public class TodoService {
    private List<Todo> todos;
    private int currentId;

    public TodoService() {
        this.todos = new ArrayList<>();
        this.currentId = 1;
    }

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo getTodoById(int id) {
        return todos.stream().filter(todo -> todo.getId() == id).findFirst().orElse(null);
    }

    public Todo addTodo(String description) {
        Todo newTodo = new Todo(currentId++, description);
        todos.add(newTodo);
        return newTodo;
    }

    public boolean deleteTodoById(int id) {
        return todos.removeIf(todo -> todo.getId() == id);
    }

    public boolean markTodoAsCompleted(int id) {
        Todo todo = getTodoById(id);
        if (todo != null) {
            todo.setCompleted(true);
            return true;
        }
        return false;
    }
}

package controller;

import java.util.List;
import java.util.Scanner;

import model.Todo;
import service.TodoService;

public class TodoController {
    private TodoService todoService;
    private Scanner scanner;

    public TodoController() {
        this.todoService = new TodoService();
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Todo List Application");
        System.out.println("1. View all Todos");
        System.out.println("2. Add a Todo");
        System.out.println("3. Delete a Todo");
        System.out.println("4. Mark Todo as Completed");
        System.out.println("5. Exit");
    }

    public void start() {
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    viewAllTodos();
                    break;
                case 2:
                    addTodo();
                    break;
                case 3:
                    deleteTodo();
                    break;
                case 4:
                    markTodoAsCompleted();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void viewAllTodos() {
        List<Todo> todos = todoService.getAllTodos();
        if (todos.isEmpty()) {
            System.out.println("No todos found.");
        } else {
            todos.forEach(todo -> System.out.println(todo));
        }
    }

    private void addTodo() {
        System.out.println("Enter the description of the new todo:");
        String description = scanner.nextLine();
        Todo todo = todoService.addTodo(description);
        System.out.println("Added new todo: " + todo);
    }

    private void deleteTodo() {
        System.out.println("Enter the ID of the todo to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        boolean success = todoService.deleteTodoById(id);
        if (success) {
            System.out.println("Deleted todo with ID: " + id);
        } else {
            System.out.println("Todo with ID " + id + " not found.");
        }
    }

    private void markTodoAsCompleted() {
        System.out.println("Enter the ID of the todo to mark as completed:");
        int id = Integer.parseInt(scanner.nextLine());
        boolean success = todoService.markTodoAsCompleted(id);
        if (success) {
            System.out.println("Marked todo with ID " + id + " as completed.");
        } else {
            System.out.println("Todo with ID " + id + " not found.");
        }
    }
}

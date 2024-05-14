package com.todolist;

import controller.TodoController;

public class Main {
    public static void main(String[] args) {
        TodoController controller = new TodoController();
        controller.start();
    }
}

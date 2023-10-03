package com.example.todowebapp.todo;


import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;
    static {
        todos.add(new Todo(todosCount++, "in28minutes","Get AWS Certified 1",
                LocalDate.now().plusYears(1), false ));
        todos.add(new Todo(todosCount++, "in28minutes","Learn DevOps 1",
                LocalDate.now().plusYears(2), false ));
        todos.add(new Todo(todosCount++, "in28minutes","Learn Full Stack Development 1",
                LocalDate.now().plusYears(3), false ));
    }

    public List<Todo> findByUsername(String username){
        return todos.stream().filter(todo -> todo.getUsername().equalsIgnoreCase(username)).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done){
        todos.add(new Todo(todosCount++, username, description, targetDate, done));
    }
    public void deleteBiId(int id){
        todos.removeIf(todo -> todo.getId() == id);
    }
    public Todo findById(int id){
        return  todos.stream().filter(it-> it.getId() == id).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo){
        deleteBiId(todo.getId());
        todos.add(todo);
    }

}
package com.example.todowebapp.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@Setter @Getter @ToString
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    @Size(min = 10, max = 100, message = "Enter at least 10 characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;

    public Todo() {

    }
}

package com.example.todowebapp.todo;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {

        List<Todo> todos = todoService.findByUsername("username");
        model.addAttribute("todos", todos);
        return "todos/listTodos";
    }



    @RequestMapping(value="add-todo", method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model) {
        model.put("todo",  new Todo(0, "", "default description", LocalDate.now(), false));
        return "todo/todo";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        if(result.hasErrors()) {
            return "todo/todo";
        }
        todoService.addTodo((String) model.get("name"), todo.getDescription(), LocalDate.now(), false);
        return "redirect:list-todos";
    }


    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id){
        todoService.deleteBiId(id);
        return "redirect:list-todos";
    }
}

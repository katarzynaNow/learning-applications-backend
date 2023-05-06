package com.example.todobackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository repository;

    public List<ToDo> list(){
        return repository.findAll();
    }

    public ToDo get (Integer id){
        return repository.findById(id).orElse(null);
    }

    public ToDo create (String title, String dueDate){
        ToDo newToDo = new ToDo();
        newToDo.setTitle(title);
        newToDo.setDueDate(dueDate);
        newToDo.setStatus(ToDoStatus.NEW);
        return repository.save(newToDo);
    }
}

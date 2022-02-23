
package co.com.sofka.Crud.controller;

import co.com.sofka.Crud.models.Todo;
import co.com.sofka.Crud.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation. *;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping(value="api/list")
    public Iterable<Todo> list(){
        return todoService.list();
    }
    @PostMapping(value="api/todo")
    public void save(@RequestBody Todo todo){
        todoService.save(todo);
    }
    @PutMapping(value="api/todo")
    public void update(@RequestBody Todo todo){
        if(todo.getId()!=null) todoService.save(todo);
        throw new RuntimeException("no existe id para actualizar");
    }
    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable("id")Long id){
        todoService.delete(id);
    }
    @GetMapping(value="api/{id}/todo")
    public Todo get(@PathVariable("id")Long id){
        return (Todo) todoService.get(id);
    }

}


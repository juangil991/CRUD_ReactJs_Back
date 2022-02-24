
package co.com.sofka.Crud.controller;

import co.com.sofka.Crud.models.Todo;
import co.com.sofka.Crud.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation. *;

@RestController
@CrossOrigin(origins = "*")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping(value="api/todo")
    public Iterable<Todo> list(){
        return todoService.list();
    }
    @PostMapping(value="api/todo")
    public Todo save(@RequestBody Todo todo){
       return todoService.save(todo);
    }
    @PutMapping(value="api/todo")
    public Todo update(@RequestBody Todo todo){
        if(todo.getId()!=null) return todoService.save(todo);
      else  throw new RuntimeException("no existe id para actualizar");
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


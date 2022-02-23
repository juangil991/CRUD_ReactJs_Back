
package co.com.sofka.Crud.services;

import co.com.sofka.Crud.models.Todo;
import co.com.sofka.Crud.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    ITodoRepository repoTodo;

    public Iterable<Todo> list(){
        return repoTodo.findAll();
    }

    public Todo save(Todo todo){
         return repoTodo.save(todo);
    }

    public void delete(Long id){
        repoTodo.delete(get(id));
    }

    public Todo get(Long id){
        return repoTodo.findById(id).orElseThrow();
    }

}


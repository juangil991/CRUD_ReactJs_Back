
package co.com.sofka.Crud.repository;

import co.com.sofka.Crud.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITodoRepository extends CrudRepository<Todo,Long > {

}


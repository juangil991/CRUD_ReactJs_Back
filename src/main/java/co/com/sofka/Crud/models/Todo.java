package co.com.sofka.Crud.models;

import javax.persistence.*;

@Entity
public class Todo {
    private Long id;
    private String name;
    private boolean isCompleted;
}

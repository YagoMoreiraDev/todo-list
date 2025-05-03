package cloud.yagodev.projeto.todo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefa")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public Task() {
    }

    public Task(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package cloud.yagodev.projeto.todo.dtos;

import cloud.yagodev.projeto.todo.entities.Task;

public class TaskDTO {

    private Long id;
    private String description;

    public TaskDTO() {
    }

    public TaskDTO(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public TaskDTO(Task task) {
        id = task.getId();
        description = task.getDescription();
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}

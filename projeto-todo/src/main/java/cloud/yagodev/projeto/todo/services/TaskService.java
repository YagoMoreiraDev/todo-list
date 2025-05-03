package cloud.yagodev.projeto.todo.services;

import cloud.yagodev.projeto.todo.dtos.TaskDTO;
import cloud.yagodev.projeto.todo.entities.Task;
import cloud.yagodev.projeto.todo.repositories.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Transactional(readOnly = true)
    public List<TaskDTO> buscaTodasService() {
        List<Task> taskList = taskRepository.findAll();
        return taskList.stream().map(item -> new TaskDTO(item)).toList();
    }

    @Transactional
    public TaskDTO inserirService(TaskDTO taskDTO) {
        Task task = new Task();
        task.setDescription(taskDTO.getDescription());

        task = taskRepository.save(task);
        return new TaskDTO(task);
    }

}

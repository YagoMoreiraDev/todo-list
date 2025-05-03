package cloud.yagodev.projeto.todo.controller;

import cloud.yagodev.projeto.todo.dtos.TaskDTO;
import cloud.yagodev.projeto.todo.services.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<TaskDTO> buscarTodosController() {
        return taskService.buscaTodasService();
    }

    @PostMapping
    public TaskDTO inserirController(@RequestBody TaskDTO taskDTO) {
        return taskService.inserirService(taskDTO);
    }
}

package cloud.yagodev.projeto.todo.controller;

import cloud.yagodev.projeto.todo.dtos.TaskDTO;
import cloud.yagodev.projeto.todo.services.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<TaskDTO>> buscarTodosController() {
        List<TaskDTO> taskDTOList = taskService.buscaTodasService();
        return ResponseEntity.ok(taskDTOList);
    }

    @PostMapping
    public ResponseEntity<TaskDTO> inserirController(@RequestBody TaskDTO taskDTO) {
        taskDTO = taskService.inserirService(taskDTO);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(taskDTO.getId())
                .toUri();
        return ResponseEntity.created(uri).body(taskDTO);
    }
}

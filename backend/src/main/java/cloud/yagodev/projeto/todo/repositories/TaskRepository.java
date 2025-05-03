package cloud.yagodev.projeto.todo.repositories;

import cloud.yagodev.projeto.todo.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}

package config;

import lombok.RequiredArgsConstructor;
import model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import repository.TaskRepository;

import java.util.Arrays;

@Configuration
@Profile("test")
@RequiredArgsConstructor // Lombok irá gerar um construtor com os argumentos finais
public class TaskConfig implements CommandLineRunner {

    private final TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {
        Task task1 = new Task(null, "Task 1", "Complete the backend development", "não iniciado");
        Task task2 = new Task(null, "Task 2", "Test the API endpoints", "em andamento");
        Task task3 = new Task(null, "Task 3", "Write documentation", "concluído");
        Task task4 = new Task(null, "Task 4", "Implement frontend with React", "não iniciado");

        taskRepository.saveAll(Arrays.asList(task1, task2, task3, task4));
    }
}
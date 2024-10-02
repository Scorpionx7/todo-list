package config;

import lombok.RequiredArgsConstructor;
import model.Task;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import repository.TaskRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static enums.Status.*;

@Configuration
@Profile("test")
@RequiredArgsConstructor // Lombok irá gerar um construtor com os argumentos finais
public class TaskConfig implements CommandLineRunner {

    private final TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {
        Task task1 = new Task(null, "Task 1", "Complete the backend development", LocalDateTime.parse("2024-10-02T00:00:00"), NOT_STARTED);
        Task task2 = new Task(null, "Task 2", "Test the API endpoints",LocalDateTime.parse("2024-10-02T00:00:00"),IN_PROGRESS );
        Task task3 = new Task(null, "Task 3", "Write documentation",LocalDateTime.parse("2024-10-02T00:00:00"),COMPLETED);
        Task task4 = new Task(null, "Task 4", "Implement frontend with React",LocalDateTime.parse("2024-10-02T00:00:00"),NOT_STARTED);

        taskRepository.saveAll(Arrays.asList(task1, task2, task3, task4));
    }
}
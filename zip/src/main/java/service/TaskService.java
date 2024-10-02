package service;

import lombok.RequiredArgsConstructor;
import model.Task;
import org.springframework.stereotype.Service;
import repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

   public Task createTask(Task task){
       return taskRepository.save(task);
   }

   public List<Task> getAllTasks(){
       return taskRepository.findAll();
   }

   public Optional<Task> getTaskById(Long id){
       return taskRepository.findById(id);
   }

   public void deleteTaskById(Long id){
       taskRepository.deleteById(id);
   }

   public Task updateTask(Task task){
       return taskRepository.save(task);
   }

   public Task saveTask(Task task){
       return taskRepository.save(task);
   }
}

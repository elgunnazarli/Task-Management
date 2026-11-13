package com.example.demo.Service;

import com.example.demo.Entity.TaskEntity;
import com.example.demo.dto.TaskResponseDto;
import com.example.demo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class TaskService {

    private final TaskRepository repository;


    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<TaskEntity> getAll(){

        return repository.findAll();
    }
    public TaskResponseDto getById(Integer id){
        TaskEntity taskEntity = repository.findById(id).get();

        return new TaskResponseDto(
                taskEntity.getId(),
                taskEntity.getTitle(),
                taskEntity.getDescription(),
                taskEntity.getTaskStatus(),
                taskEntity.getTaskPriority(),
                taskEntity.getTaskWeight(),
                taskEntity.getCreatedAt()
        );
    }

    public void saveTask(TaskEntity taskEntity){

        repository.save(taskEntity);
    }
    public void deleteById(Integer id){

        repository.deleteById(id);
    }

    public TaskEntity update(Integer id,TaskEntity taskEntity) {
        taskEntity.setId(id);
        return repository.save(taskEntity);
    }
}
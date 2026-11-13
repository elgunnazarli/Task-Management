package com.example.demo.repository;

import com.example.demo.Entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {

    @Query("""
        update TaskEntity a set a.taskStatus = false where a.id = ?1
""")

    void updateTaskEntity(Integer id);
}

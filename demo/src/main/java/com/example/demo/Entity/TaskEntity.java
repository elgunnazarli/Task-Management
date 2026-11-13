package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)

public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "title", length = 30)
    String title;

    @Column(name = "description", columnDefinition = "TEXT")
    String description;

    @Column(name = "task_status")
    @Enumerated(EnumType.STRING)
    TaskStatus taskStatus = TaskStatus.TODO;

    @Column(name = "task_priority")
    @Enumerated(EnumType.STRING)
    TaskPriority taskPriority;

    @Column(name = "taskWeight")
    String taskWeight;

    @Column(name = "status")
    Boolean status = true;

    @Column(name = "createdAt")
    LocalDateTime createdAt = LocalDateTime.now();

    public void setId(Integer id) {
    }
}
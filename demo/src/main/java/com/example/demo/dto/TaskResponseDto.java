package com.example.demo.dto;

import com.example.demo.Entity.TaskPriority;
import com.example.demo.Entity.TaskStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
public class TaskResponseDto {
    Integer id;

    String title;

    String description;

    TaskStatus taskStatus;

    TaskPriority taskPriority;

    String taskWeight;

    LocalDateTime createdAt;
}

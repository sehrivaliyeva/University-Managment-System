package org.example.universitymanagementsystem.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateEnrollmentDTO {

    @NotNull(message = "Student Id cannot be empty.")
    private Long studentId;

    @NotNull(message = "Course Id cannot be empty.")
    private Long courseId;
}

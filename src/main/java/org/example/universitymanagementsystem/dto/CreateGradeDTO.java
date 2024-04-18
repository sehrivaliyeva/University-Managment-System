package org.example.universitymanagementsystem.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateGradeDTO {
    @NotNull(message = "StudentId cannot be null.")
    private Long studentId;

    @NotNull(message = "CourseId cannot be null.")
    private Long courseId;

    @NotNull(message = "InstructorId cannot be null.")
    private Long instructorId;

    @NotNull(message = "grade cannot be null.")
    private int grade;
}

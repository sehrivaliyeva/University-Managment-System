package org.example.universitymanagementsystem.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.example.universitymanagementsystem.repository.entity.AttendanceTypeEnum;

@Getter
@Setter
public class CreateLessonAttendanceDTO {
    @NotNull(message = "Student Id cannot be null")
    private Long studentId;

    @NotNull(message = "Lesson Id cannot be null")
    private Long lessonId;

    private AttendanceTypeEnum attendanceTypeEnum;
}

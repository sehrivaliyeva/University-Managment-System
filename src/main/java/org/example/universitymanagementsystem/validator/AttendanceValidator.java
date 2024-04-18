package org.example.universitymanagementsystem.validator;

import lombok.AllArgsConstructor;
import org.example.universitymanagementsystem.annotation.Validator;
import org.example.universitymanagementsystem.exception.AttendanceValidateException;
import org.example.universitymanagementsystem.repository.AttendanceRepository;
import org.example.universitymanagementsystem.repository.entity.AttendanceEntity;

@Validator
@AllArgsConstructor
public class AttendanceValidator {
    private final AttendanceRepository attendanceRepository;

    public void validateAttendanceNotExist(AttendanceEntity attendanceEntity) {
        var response = attendanceRepository.findByLessonAndStudent(attendanceEntity.getLesson(), attendanceEntity.getStudent());
        if (response.isPresent()) {
            throw new AttendanceValidateException("Attendance is already submitted.");
        }
    }
}

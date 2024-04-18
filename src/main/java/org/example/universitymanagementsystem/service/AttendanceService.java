package org.example.universitymanagementsystem.service;

import lombok.AllArgsConstructor;
import org.example.universitymanagementsystem.dto.CreateLessonAttendanceDTO;
import org.example.universitymanagementsystem.dto.UpdateAttendanceDTO;
import org.example.universitymanagementsystem.manager.AttendanceManager;
import org.example.universitymanagementsystem.manager.LessonManager;
import org.example.universitymanagementsystem.manager.StudentManager;
import org.example.universitymanagementsystem.repository.AttendanceRepository;
import org.example.universitymanagementsystem.repository.entity.AttendanceEntity;
import org.example.universitymanagementsystem.validator.AttendanceValidator;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AttendanceService {
    private final AttendanceRepository attendanceRepository;
    private final LessonManager lessonManager;
    private final StudentManager studentManager;
    private final AttendanceValidator attendanceValidator;
    private final AttendanceManager attendanceManager;

    public void create(CreateLessonAttendanceDTO createLessonAttendanceDTO) {
        var lesson = lessonManager.getLesson(createLessonAttendanceDTO.getLessonId());
        var student = studentManager.getStudent(createLessonAttendanceDTO.getStudentId());
        var attendance = new AttendanceEntity();
        attendance.setAttendanceTypeEnum(createLessonAttendanceDTO.getAttendanceTypeEnum());
        attendance.setLesson(lesson);
        attendance.setStudent(student);

        attendanceValidator.validateAttendanceNotExist(attendance);
        attendanceRepository.save(attendance);
    }

    public void update(Long id, UpdateAttendanceDTO updateAttendanceDTO) {
        var attendance = attendanceManager.getAttendance(id);
        attendance.setAttendanceTypeEnum(updateAttendanceDTO.getAttendanceTypeEnum());
        attendanceRepository.save(attendance);
    }
}

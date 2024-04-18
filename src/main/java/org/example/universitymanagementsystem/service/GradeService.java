package org.example.universitymanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.example.universitymanagementsystem.dto.CreateGradeDTO;
import org.example.universitymanagementsystem.manager.CourseManager;
import org.example.universitymanagementsystem.manager.InstructorManager;
import org.example.universitymanagementsystem.manager.StudentManager;
import org.example.universitymanagementsystem.mapper.GradeMapper;
import org.example.universitymanagementsystem.repository.GradeRepository;
import org.example.universitymanagementsystem.validator.GradeValidator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GradeService {
    private final CourseManager courseManager;
    private final StudentManager studentManager;
    private final InstructorManager instructorManager;
    private final GradeValidator gradeValidator;
    private final GradeRepository gradeRepository;
    private final GradeMapper gradeMapper;

    public void create(CreateGradeDTO createGradeDTO) {
        var student = studentManager.getStudent(createGradeDTO.getStudentId());
        var course = courseManager.getCourse(createGradeDTO.getCourseId());
        var instructor=instructorManager.getInstructor(createGradeDTO.getInstructorId());
        var grade=gradeMapper.toGrade(createGradeDTO);

        gradeValidator.validate(student,course,instructor);

        grade.setCourse(course);
        grade.setInstructor(instructor);
        grade.setStudent(student);

        gradeRepository.save(grade);
    }
}

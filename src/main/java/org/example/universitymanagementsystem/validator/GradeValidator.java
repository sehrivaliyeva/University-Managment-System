package org.example.universitymanagementsystem.validator;

import org.example.universitymanagementsystem.annotation.Validator;
import org.example.universitymanagementsystem.exception.GradeValidationException;
import org.example.universitymanagementsystem.repository.entity.CourseEntity;
import org.example.universitymanagementsystem.repository.entity.InstructorEntity;
import org.example.universitymanagementsystem.repository.entity.StudentEntity;

@Validator
public class GradeValidator {
    public void validate(StudentEntity student, CourseEntity course,InstructorEntity instructor) {
       validateCourseAndInstructor(course,instructor);
       validateCourseAndStudent(course,student);
    }

    private void validateCourseAndInstructor(CourseEntity course, InstructorEntity instructor) {
        if (course.getInstructor() == null || !course.getInstructor().equals(instructor)) {
            throw new GradeValidationException("Course must have the specified instructor");
        }
    }

    private void validateCourseAndStudent(CourseEntity course, StudentEntity student) {
        if (course.getStudents() == null || !course.getStudents().contains(student)) {
            throw new GradeValidationException("Course must have the specified student");
        }
    }
}

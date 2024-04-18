package org.example.universitymanagementsystem.validator;

import org.example.universitymanagementsystem.annotation.Validator;
import org.example.universitymanagementsystem.exception.StudentValidationException;
import org.example.universitymanagementsystem.repository.entity.CourseEntity;
import org.example.universitymanagementsystem.repository.entity.StudentEntity;

import java.util.Objects;

@Validator
public class StudentValidator {

    public void validate(StudentEntity studentEntity, CourseEntity courseEntity) {
        validateCourseExist(studentEntity, courseEntity);
        validateCredit(studentEntity, courseEntity.getCredit());
    }

    private void validateCourseExist(StudentEntity studentEntity, CourseEntity course) {
        var response = studentEntity.getCourses().stream()
                .anyMatch(existingCourse -> Objects.equals(existingCourse.getId(), course.getId()));

        if (response) {
            throw new StudentValidationException("Course already is enrolled");
        }
    }

    private void validateCredit(StudentEntity studentEntity, int newCredit) {
        var currentCreditSum = studentEntity.getCourses()
                .stream()
                .map(CourseEntity::getCredit)
                .reduce(0, Integer::sum);

        var totalCreditSum = currentCreditSum + newCredit;

        if (totalCreditSum > 30) {
            throw new StudentValidationException("Credit is allowed maximum 30");
        }
    }
}

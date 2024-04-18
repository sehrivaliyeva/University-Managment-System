package org.example.universitymanagementsystem.validator;

import org.example.universitymanagementsystem.annotation.Validator;
import org.example.universitymanagementsystem.exception.LessonValidationException;
import org.example.universitymanagementsystem.repository.entity.LessonEntity;

import java.time.temporal.ChronoUnit;

@Validator
public class LessonValidator {
    public void validateLesson(LessonEntity lessonEntity) {
    validateDuration(lessonEntity);
    }

    private void validateDuration(LessonEntity lessonEntity) {
        if (!lessonEntity.getStartedAt().plus(90, ChronoUnit.MINUTES).equals(lessonEntity.getEndedAt())) {
            throw new LessonValidationException("Lesson duration should be 90 minutes");
        }
    }
}

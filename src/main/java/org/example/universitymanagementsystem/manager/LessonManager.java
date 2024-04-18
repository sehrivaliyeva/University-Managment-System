package org.example.universitymanagementsystem.manager;

import lombok.AllArgsConstructor;
import org.example.universitymanagementsystem.annotation.Manager;
import org.example.universitymanagementsystem.exception.LessonNotFoundException;
import org.example.universitymanagementsystem.repository.LessonRepository;
import org.example.universitymanagementsystem.repository.entity.LessonEntity;

@Manager
@AllArgsConstructor
public class LessonManager {
    private final LessonRepository lessonRepository;

    public LessonEntity getLesson(Long id) {
        return lessonRepository.findById(id)
                .orElseThrow(() -> new LessonNotFoundException("Lesson not found with Id: " + id));
    }
}

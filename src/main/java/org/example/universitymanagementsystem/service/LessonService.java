package org.example.universitymanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.example.universitymanagementsystem.dto.CreateLessonDTO;
import org.example.universitymanagementsystem.manager.CourseManager;
import org.example.universitymanagementsystem.mapper.LessonMapper;
import org.example.universitymanagementsystem.repository.LessonRepository;
import org.example.universitymanagementsystem.validator.LessonValidator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LessonService {
    private final LessonMapper lessonMapper;
    private final CourseManager courseManager;
    private final LessonRepository lessonRepository;
    private final LessonValidator lessonValidator;

    public void create(CreateLessonDTO createLessonDTO) {
        var lesson = lessonMapper.toLessonEntity(createLessonDTO);
        var course = courseManager.getCourse(createLessonDTO.getCourseId());
        lesson.setCourse(course);

        lessonValidator.validateLesson(lesson);
        lessonRepository.save(lesson);
    }
}

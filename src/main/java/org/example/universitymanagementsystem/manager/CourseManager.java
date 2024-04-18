package org.example.universitymanagementsystem.manager;

import lombok.RequiredArgsConstructor;
import org.example.universitymanagementsystem.annotation.Manager;
import org.example.universitymanagementsystem.exception.CourseNotFoundException;
import org.example.universitymanagementsystem.repository.CourseRepository;
import org.example.universitymanagementsystem.repository.entity.CourseEntity;

import java.util.List;
import java.util.Optional;

@Manager
@RequiredArgsConstructor
public class CourseManager {
    private final CourseRepository courseRepository;

    public CourseEntity getCourse(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new CourseNotFoundException("Course Not Found: " + id));
    }

    public List<CourseEntity> findAllByIsDeleted() {
        return courseRepository.findAllByIsDeleted(false);
    }

    public Optional<CourseEntity> findByIdAndIsDeleted(Long id) {
        return courseRepository.findByIdAndIsDeleted(id, false);
    }

}

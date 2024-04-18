package org.example.universitymanagementsystem.manager;

import lombok.RequiredArgsConstructor;
import org.example.universitymanagementsystem.annotation.Manager;
import org.example.universitymanagementsystem.exception.StudentNotFoundException;
import org.example.universitymanagementsystem.repository.StudentRepository;
import org.example.universitymanagementsystem.repository.entity.StudentEntity;

import java.util.List;

@Manager
@RequiredArgsConstructor
public class StudentManager {
    private final StudentRepository studentRepository;

    public StudentEntity getStudent(Long id) {
        return studentRepository.findByIdAndIsDeleted(id, false)
                .orElseThrow(() -> new StudentNotFoundException("student not found : " + id));
    }

    public List<StudentEntity> findAllByIsDeleted() {
        return studentRepository.findAllByIsDeleted(false);
    }
}


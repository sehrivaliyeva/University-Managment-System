package org.example.universitymanagementsystem.manager;

import lombok.RequiredArgsConstructor;
import org.example.universitymanagementsystem.annotation.Manager;
import org.example.universitymanagementsystem.exception.InstructorNotFoundException;
import org.example.universitymanagementsystem.repository.InstructorRepository;
import org.example.universitymanagementsystem.repository.entity.InstructorEntity;

import java.util.List;

@Manager
@RequiredArgsConstructor
public class InstructorManager {
    private final InstructorRepository instructorRepository;

    public InstructorEntity getInstructor(Long id) {
        return instructorRepository.findByIdAndIsDeleted(id, false)
                .orElseThrow(() -> new InstructorNotFoundException("Instructor not found with id:" + id));
    }

    public List<InstructorEntity> findAllByIsDeleted() {
        return instructorRepository.findAllByIsDeleted(false);
    }

}

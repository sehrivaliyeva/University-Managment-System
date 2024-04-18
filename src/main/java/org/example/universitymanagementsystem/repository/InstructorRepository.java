package org.example.universitymanagementsystem.repository;

import org.example.universitymanagementsystem.repository.entity.InstructorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InstructorRepository extends JpaRepository<InstructorEntity, Long> {
    List<InstructorEntity> findAllByIsDeleted(boolean isDeleted);

    Optional<InstructorEntity> findByIdAndIsDeleted(Long id, boolean isDeleted);
}

package org.example.universitymanagementsystem.repository;

import org.example.universitymanagementsystem.repository.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;
@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {

    List<CourseEntity> findAllByIsDeleted(boolean isDeleted);

    Optional<CourseEntity> findByIdAndIsDeleted(Long id, boolean isDeleted);

    Optional<CourseEntity> findById(Long id);
}

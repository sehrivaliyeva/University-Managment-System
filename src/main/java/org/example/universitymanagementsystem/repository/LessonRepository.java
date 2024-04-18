package org.example.universitymanagementsystem.repository;

import org.example.universitymanagementsystem.repository.entity.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<LessonEntity, Long> {
}

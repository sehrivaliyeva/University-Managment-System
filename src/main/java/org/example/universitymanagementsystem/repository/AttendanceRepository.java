package org.example.universitymanagementsystem.repository;

import org.example.universitymanagementsystem.repository.entity.AttendanceEntity;
import org.example.universitymanagementsystem.repository.entity.LessonEntity;
import org.example.universitymanagementsystem.repository.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AttendanceRepository extends JpaRepository<AttendanceEntity,Long> {
    Optional<AttendanceEntity> findByLessonAndStudent(LessonEntity lessonEntity, StudentEntity studentEntity);
}

package org.example.universitymanagementsystem.repository;

import org.example.universitymanagementsystem.repository.entity.GradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<GradeEntity,Long> {
}

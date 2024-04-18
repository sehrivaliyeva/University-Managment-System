package org.example.universitymanagementsystem.mapper;

import org.example.universitymanagementsystem.dto.CreateLessonDTO;
import org.example.universitymanagementsystem.repository.entity.LessonEntity;
import org.example.universitymanagementsystem.service.LessonService;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LessonMapper {
    LessonEntity toLessonEntity(CreateLessonDTO createLessonDTO);
}

package org.example.universitymanagementsystem.mapper;

import org.example.universitymanagementsystem.dto.CourseDTO;
import org.example.universitymanagementsystem.dto.CreateCourseDTO;
import org.example.universitymanagementsystem.dto.UpdateCourseDTO;
import org.example.universitymanagementsystem.repository.entity.CourseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    List<CourseDTO> toCourseDTOList(List<CourseEntity> courseEntities);

    CourseEntity toCourseEntity(CreateCourseDTO createCourseDTO);

    CourseDTO toCourseDTO(CourseEntity courseEntity);

    void toCourseEntity(UpdateCourseDTO updateCourseDTO, @MappingTarget CourseEntity courseEntity);
}

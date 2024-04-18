package org.example.universitymanagementsystem.mapper;

import org.example.universitymanagementsystem.dto.CreateStudentDTO;
import org.example.universitymanagementsystem.dto.StudentDTO;
import org.example.universitymanagementsystem.dto.UpdateStudentDTO;
import org.example.universitymanagementsystem.repository.entity.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    List<StudentDTO> toStudentDTOList(List<StudentEntity> studentEntities);
    StudentEntity toStudentEntity(CreateStudentDTO createStudentDTO);
    StudentDTO toStudentDTO(StudentEntity studentEntity);
    void toStudentEntity(UpdateStudentDTO updateStudentDTO, @MappingTarget StudentEntity studentEntity);
}

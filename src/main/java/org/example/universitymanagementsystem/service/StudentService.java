package org.example.universitymanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.example.universitymanagementsystem.dto.CreateStudentDTO;
import org.example.universitymanagementsystem.dto.StudentDTO;
import org.example.universitymanagementsystem.dto.UpdateStudentDTO;
import org.example.universitymanagementsystem.manager.StudentManager;
import org.example.universitymanagementsystem.mapper.StudentMapper;
import org.example.universitymanagementsystem.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final StudentManager studentManager;

    public List<StudentDTO> findAll() {
        var studentEntities = studentManager.findAllByIsDeleted();
        return studentMapper.toStudentDTOList(studentEntities);
    }

    public StudentDTO findById(Long id) {
        return studentMapper.toStudentDTO(studentManager.getStudent(id));
    }

    public void create(CreateStudentDTO createStudentDTO) {
        studentRepository.save(studentMapper.toStudentEntity(createStudentDTO));
    }

    public void update(Long id, UpdateStudentDTO updateStudentDTO) {
        var student = studentManager.getStudent(id);
        studentMapper.toStudentEntity(updateStudentDTO, student);
        studentRepository.save(student);
    }

    public void delete(Long id) {
        var student = studentManager.getStudent(id);
        student.setDeleted(true);
        studentRepository.save(student);
    }
}

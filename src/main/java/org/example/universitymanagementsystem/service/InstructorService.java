package org.example.universitymanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.example.universitymanagementsystem.dto.CreateInstructorDTO;
import org.example.universitymanagementsystem.dto.InstructorDTO;
import org.example.universitymanagementsystem.dto.InstructorDetailsDTO;
import org.example.universitymanagementsystem.dto.UpdateInstructorDTO;
import org.example.universitymanagementsystem.manager.CourseManager;
import org.example.universitymanagementsystem.manager.InstructorManager;
import org.example.universitymanagementsystem.mapper.InstructorMapper;
import org.example.universitymanagementsystem.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorService {
    private final InstructorRepository instructorRepository;
    private final InstructorMapper instructorMapper;
    private final InstructorManager instructorManager;

    public List<InstructorDTO> findAll() {
        var instructorEntities = instructorManager.findAllByIsDeleted();
        return instructorMapper.toInstructorDTOList(instructorEntities);
    }

    public InstructorDetailsDTO findById(Long id) {
        return instructorMapper.toInstructorDetailsDTO(instructorManager.getInstructor(id));
    }

    public void create(CreateInstructorDTO createInstructorDTO) {
        var instructor = instructorMapper.toInstructor(createInstructorDTO);
        instructorRepository.save(instructor);
    }

    public void update(Long id, UpdateInstructorDTO updateInstructorDTO) {
        var instructor = instructorManager.getInstructor(id);
        instructorMapper.toInstructor(updateInstructorDTO, instructor);
        instructorRepository.save(instructor);
    }

    public void delete(Long id) {
        var instructor = instructorManager.getInstructor(id);
        instructor.setDeleted(true);
        instructorRepository.save(instructor);
    }
}

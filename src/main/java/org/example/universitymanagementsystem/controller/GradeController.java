package org.example.universitymanagementsystem.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.universitymanagementsystem.dto.CreateGradeDTO;
import org.example.universitymanagementsystem.service.GradeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/grades")
@RequiredArgsConstructor
public class GradeController {
    private final GradeService gradeService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody @Valid CreateGradeDTO createGradeDTO) {
        gradeService.create(createGradeDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

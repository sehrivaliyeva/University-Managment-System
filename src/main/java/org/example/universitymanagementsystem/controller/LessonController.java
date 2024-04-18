package org.example.universitymanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import org.example.universitymanagementsystem.dto.CreateLessonDTO;
import org.example.universitymanagementsystem.service.LessonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/lessons")
@RequiredArgsConstructor
public class LessonController {
    private final LessonService lessonService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CreateLessonDTO createLessonDTO) {
        lessonService.create(createLessonDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

package org.example.universitymanagementsystem.controller;

import lombok.AllArgsConstructor;
import org.example.universitymanagementsystem.dto.CreateLessonAttendanceDTO;
import org.example.universitymanagementsystem.dto.UpdateAttendanceDTO;
import org.example.universitymanagementsystem.service.AttendanceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/attendances")
public class AttendanceController {
    private final AttendanceService attendanceService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CreateLessonAttendanceDTO createLessonAttendanceDTO) {
        attendanceService.create(createLessonAttendanceDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody UpdateAttendanceDTO updateAttendanceDTO) {
        attendanceService.update(id, updateAttendanceDTO);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

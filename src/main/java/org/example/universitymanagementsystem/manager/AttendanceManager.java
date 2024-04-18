package org.example.universitymanagementsystem.manager;

import lombok.AllArgsConstructor;
import org.example.universitymanagementsystem.annotation.Manager;
import org.example.universitymanagementsystem.exception.AttendanceNotFoundException;
import org.example.universitymanagementsystem.repository.AttendanceRepository;
import org.example.universitymanagementsystem.repository.entity.AttendanceEntity;

@Manager
@AllArgsConstructor
public class AttendanceManager {
    private AttendanceRepository attendanceRepository;

    public AttendanceEntity getAttendance(Long id) {
        return attendanceRepository.findById(id)
                .orElseThrow(() -> new AttendanceNotFoundException("Attendance not found with Id: " + id));
    }
}

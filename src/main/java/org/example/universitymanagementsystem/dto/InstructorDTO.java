package org.example.universitymanagementsystem.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
public class InstructorDTO {
    private Long id;
    private String name;
    private String experience;
    private Instant createdAt;
    private Instant modifiedAt;
}

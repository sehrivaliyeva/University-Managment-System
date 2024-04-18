package org.example.universitymanagementsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
@Getter
@Setter
public class InstructorDetailsDTO {
    private Long id;
    private String name;
    private String experience;
    private Instant createdAt;
    private Instant modifiedAt;
}

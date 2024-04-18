package org.example.universitymanagementsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class CourseDTO {
    private Long id;
    private String name;
    private Long capacity;
    private String code;
    private int credit;
    private Instant createdAt;
    private Instant modifiedAt;

}

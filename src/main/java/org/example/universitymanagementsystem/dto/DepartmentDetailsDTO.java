package org.example.universitymanagementsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class DepartmentDetailsDTO {
    private Long id;
    private String name;
    private String code;
    private Long capacity;
    private Instant createdAt;
    private Instant modifiedAt;
}

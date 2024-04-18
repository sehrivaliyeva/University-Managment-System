package org.example.universitymanagementsystem.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class UpdateInstructorDTO {

    @NotBlank(message = "Name cannot be empty.")
    private String name;

    @NotBlank(message = "Experience cannot be empty.")
    private String experience;

    private Instant createdAt;
    private Instant modifiedAt;
}

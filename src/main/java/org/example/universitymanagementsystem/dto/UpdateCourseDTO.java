package org.example.universitymanagementsystem.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateCourseDTO {

    @NotBlank(message = "Name cannot be empty.")
    private String name;

    @NotBlank(message = "Capacity cannot be empty.")
    private Long capacity;

    @NotBlank(message = "Code cannot be empty.")
    private String code;

    @NotBlank(message = "Credit cannot be empty.")
    private int credit;
}

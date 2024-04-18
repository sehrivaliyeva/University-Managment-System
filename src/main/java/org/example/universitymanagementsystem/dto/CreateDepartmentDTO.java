package org.example.universitymanagementsystem.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateDepartmentDTO {

    @NotBlank(message = "Name cannot be empty.")
    private String name;

    @NotBlank(message = "Code cannot be empty.")
    private String code;

    @NotBlank(message = "Capacity cannot be empty.")
    private Long capacity;
}

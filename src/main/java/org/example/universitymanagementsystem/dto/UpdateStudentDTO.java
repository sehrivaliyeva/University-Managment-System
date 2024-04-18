package org.example.universitymanagementsystem.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateStudentDTO {

    @NotBlank(message = "Name cannot be empty.")
    @Min(value = 5, message = "Minimum length is 5")
    @Max(value = 40, message = "Maximum length is 40")
    private String name;
}

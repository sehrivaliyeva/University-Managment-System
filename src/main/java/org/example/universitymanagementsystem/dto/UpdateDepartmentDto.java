package org.example.universitymanagementsystem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class UpdateDepartmentDto {

    @NotBlank(message = "Name cannot be empty.")
    @NotNull
    @Length(min = 5, max = 40, message = "Min and Max length 5-40")
    private String name;

    @NotBlank(message = "Name cannot be empty.")
    private String code;

    @NotBlank(message = "Name cannot be empty.")
    private Long capacity;
}

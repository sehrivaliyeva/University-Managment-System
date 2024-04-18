package org.example.universitymanagementsystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.example.universitymanagementsystem.annotation.validator.NullOrNotBlank;

@Setter
@Getter
public class CreateStudentDTO {

    @NotBlank(message = "Name cannot be empty.")
    private String name;

    @NotBlank(message = "Email cannot be empty.")
    @Email(message = "Email format is not correct.")
    private String email;

    @NullOrNotBlank(message = "Address cannot be empty. Null or full address")
    private String address;

    @NotBlank(message = "Phone number cannot be empty.")
    private String phoneNumber;
}

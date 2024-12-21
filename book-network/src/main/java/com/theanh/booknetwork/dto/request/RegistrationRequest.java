package com.theanh.booknetwork.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record RegistrationRequest(

        @NotEmpty(message = "First name is mandatory.")
        @NotBlank(message = "First name is mandatory.")
        String firstName,

        @NotEmpty(message = "Last name is mandatory.")
        @NotBlank(message = "Last name is mandatory.")
        String lastName,

        @Email(message = "Email is not formatted correctly.")
        @NotEmpty(message = "Email is mandatory.")
        @NotBlank(message = "Email is mandatory.")
        String email,

        @Size(min = 8, message = "Password should be at least 8 characters long.")
        @NotEmpty(message = "Password is mandatory.")
        @NotBlank(message = "Password is mandatory.")
        String password
) {
}

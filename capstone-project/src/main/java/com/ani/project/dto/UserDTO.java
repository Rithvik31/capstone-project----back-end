package com.ani.project.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    public UserDTO(String name2, String email2, String password2) {
    }

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotNull(message = "Email is mandatory")
    @Email(message = "Invalid email address")
    private String email;

    @NotNull(message = "Password is mandatory")
    @Size(min = 8, max = 16, message = "Password must be between 8 and 16 characters")
    private String password;
}
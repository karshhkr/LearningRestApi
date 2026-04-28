package com.RestApi.LearningRestApi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddStudentsRequest {
    @NotEmpty(message = "nameis required")
    @Size(min = 3, max = 50, message = "Name should be of 50 char")
    private String name;
    @Email // validation is done taki yeh email format mein hi ho
    @NotBlank(message = "email is required ") // yeh field balnk nhi rakhegi field ko
    private String email;
    private String password;
}

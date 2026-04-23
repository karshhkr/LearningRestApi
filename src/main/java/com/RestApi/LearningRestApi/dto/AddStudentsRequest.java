package com.RestApi.LearningRestApi.dto;

import lombok.Data;

@Data
public class AddStudentsRequest {
    private String firstName;
    private String lastName;
    private String email;
}

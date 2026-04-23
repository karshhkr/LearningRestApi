package com.RestApi.LearningRestApi.dto;

import lombok.Data;

@Data
public class AddStudentsRequest {
    private String name;
    private String email;
    private String password;
}

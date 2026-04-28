package com.RestApi.LearningRestApi.config.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public ModelMapper modelMapper() { //model mapper is one obj is converted into another obj automatically
        //means :-Entity --> DTO
              //  DTO --> Entity
        //without writting manual code
        return new ModelMapper();
    }
}

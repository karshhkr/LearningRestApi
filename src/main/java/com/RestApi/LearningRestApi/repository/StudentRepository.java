package com.RestApi.LearningRestApi.repository;

import com.RestApi.LearningRestApi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
// repository is interface because here we  can give implementations
// data acesss layer query is wrritten here
// we extends the jparepostory cause we want springboot to handle DB operations
// otherwise without extending we would have to write mannnual JDBC code
// and extending give readymade methods of jpa repository


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {// we have to tell jpa which entity we want to connect with and datatype of the id which is Long



}

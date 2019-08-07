package com.cicada.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cicada.pojo.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
    public Student findByName(String name);

    public List<Student> findBySex(String sex);

}

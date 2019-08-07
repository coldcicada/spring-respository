package com.cicada.service;

import java.util.List;

import com.cicada.pojo.Student;
import com.mongodb.client.result.UpdateResult;

public interface StudentService {
    public Student add(Student student);

    public UpdateResult update(Student student);

    public void delete(String id);

    public Student findByName(String name);

    public List<Student> findBySex(String sex);

}

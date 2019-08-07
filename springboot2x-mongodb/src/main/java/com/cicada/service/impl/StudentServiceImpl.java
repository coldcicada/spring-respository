package com.cicada.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.cicada.dao.StudentRepository;
import com.cicada.pojo.Student;
import com.cicada.service.StudentService;
import com.mongodb.client.result.UpdateResult;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Student add(Student student) {
        Student stu = studentRepository.save(student);
        return stu;
    }

    @Override
    public UpdateResult update(Student student) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(student.getId()));
        String collectionName = "student";
        Update update = new Update();
        update.set("_id", student.getId());
        UpdateResult result = mongoTemplate.updateFirst(query, update, collectionName);
        return result;
    }

    @Override
    public void delete(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public List<Student> findBySex(String sex) {
        return studentRepository.findBySex(sex);
    }

}

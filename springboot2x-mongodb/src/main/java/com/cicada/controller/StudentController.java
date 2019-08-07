package com.cicada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cicada.pojo.Student;
import com.cicada.service.StudentService;
import com.mongodb.client.result.UpdateResult;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/add")
    public Student add(Student student) {
        return studentService.add(student);
    }

    @RequestMapping("/update")
    public UpdateResult update(Student student) {
        return studentService.update(student);
    }

    @RequestMapping("findByName")
    public Student findByName(String name) {
        return studentService.findByName(name);
    }

    @RequestMapping("findBySex")
    public List<Student> findBySex(String sex) {
        return studentService.findBySex(sex);
    }

    @RequestMapping("delete")
    public String delete(String id) {
        studentService.delete(id);
        return "success";
    }
}

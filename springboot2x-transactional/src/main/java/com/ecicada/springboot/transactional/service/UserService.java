package com.ecicada.springboot.transactional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecicada.springboot.transactional.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int insertUser(String name, Integer age) {
        int insertResult = userMapper.insert(name, age);
        int i = 1 / age;
        log.info("########insertResult:{}########", insertResult);
        return insertResult;
    }
}

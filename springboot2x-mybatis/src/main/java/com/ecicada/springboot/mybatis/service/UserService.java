package com.ecicada.springboot.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecicada.springboot.mybatis.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int insertUser(String name, Integer age) {
        int insertResult = userMapper.insert(name, age);
        log.info("########insertResult:{}########", insertResult);
        return insertResult;
    }
}

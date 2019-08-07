package com.cicada.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicada.jpa.dao.IUserDao;
import com.cicada.jpa.entity.User;
import com.cicada.jpa.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

}

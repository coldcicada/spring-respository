package com.cicada.jpa.service;

import java.util.List;

import com.cicada.jpa.entity.User;

public interface IUserService {
    List<User> findAll();
}

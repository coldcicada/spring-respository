package com.cicada.mybatis.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cicada.mybatis.pojo.User;

public interface UserService {

    List<User> findAllUsers();

    User findUserById(Integer id);

    Page<User> findUserByPage(Pageable pageable);

    void saveUser(User user);


}

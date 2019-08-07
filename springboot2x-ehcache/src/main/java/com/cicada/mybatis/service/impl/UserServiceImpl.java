package com.cicada.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cicada.mybatis.dao.UserRepository;
import com.cicada.mybatis.pojo.User;
import com.cicada.mybatis.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    @Cacheable(value = "user")
    public List<User> findAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    @Cacheable(value = "user")
    public User findUserById(Integer id) {
        return this.userRepository.getOne(id);
    }

    @Override
    @Cacheable(value = "user", key = "#pageable.pageSize")
    public Page<User> findUserByPage(Pageable pageable) {
        return this.userRepository.findAll(pageable);
    }

    @Override
    @CacheEvict(value = "user", allEntries = true)
    public void saveUser(User user) {
        this.userRepository.save(user);
    }
}

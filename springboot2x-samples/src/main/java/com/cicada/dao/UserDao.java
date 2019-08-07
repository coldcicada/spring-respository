package com.cicada.dao;

import org.apache.ibatis.annotations.Mapper;

import com.cicada.domain.User;

@Mapper
public interface UserDao {
    public User selectUserById(Integer id);
}

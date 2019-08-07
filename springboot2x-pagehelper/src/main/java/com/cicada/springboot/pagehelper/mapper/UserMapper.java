package com.cicada.springboot.pagehelper.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cicada.springboot.pagehelper.entity.User;

public interface UserMapper {
    @Select("SELECT * FROM user ")
    List<User> findUserList();
}

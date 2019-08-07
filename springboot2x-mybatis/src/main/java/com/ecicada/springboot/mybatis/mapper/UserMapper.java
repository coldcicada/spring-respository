package com.ecicada.springboot.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ecicada.springboot.mybatis.entity.User;

public interface UserMapper {
    // 查询
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findByName(@Param("name") String name);

    // 添加
    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}

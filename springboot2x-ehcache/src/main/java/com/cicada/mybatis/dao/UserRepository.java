package com.cicada.mybatis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cicada.mybatis.pojo.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

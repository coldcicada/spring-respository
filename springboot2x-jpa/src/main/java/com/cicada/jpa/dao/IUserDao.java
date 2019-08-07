package com.cicada.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cicada.jpa.entity.User;

@Repository("userDao")
//@Component
public interface IUserDao extends JpaRepository<User, Long> {

}

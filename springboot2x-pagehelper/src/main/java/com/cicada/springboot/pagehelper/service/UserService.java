package com.cicada.springboot.pagehelper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicada.springboot.pagehelper.entity.User;
import com.cicada.springboot.pagehelper.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * @param page     当前页数
     * @param pageSize 当前展示多少个
     * @return
     */
    public PageInfo<User> findUserList(int page, int pageSize) {
        // mysql limit分页
        PageHelper.startPage(page, pageSize);
        List<User> Users = userMapper.findUserList();
        PageInfo<User> pageInfoUsers = new PageInfo<User>(Users);
        return pageInfoUsers;
    }
}

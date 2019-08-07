package com.cicada.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicada.mybatis.dao.MemberDao;
import com.cicada.mybatis.pojo.Member;
import com.cicada.mybatis.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public Member findMemberByName(String name) {
        return memberDao.findMemberByName(name);
    }
}

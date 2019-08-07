package com.cicada.mybatis.service.impl;

import java.util.List;

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

    @Override
    public List<Member> findAllMembers() {
        return memberDao.findAllMembers();
    }

    @Override
    public void insertMember(String name, Integer age, Double money) {
        memberDao.insertMember(name, age, money);
    }

    @Override
    public void deleteMember(Integer id) {
        memberDao.deleteMember(id);
    }

    @Override
    public void updateMember(String name, Integer age, Double money, Integer id) {
        memberDao.updateMember(name, age, money, id);

    }
}

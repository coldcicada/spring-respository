package com.cicada.mybatis.service;

import java.util.List;

import com.cicada.mybatis.pojo.Member;

public interface MemberService {

    List<Member> findAllMembers();

    Member findMemberByName(String name);

    void insertMember(String name, Integer age, Double money);

    void deleteMember(Integer id);

    void updateMember(String name, Integer age, Double money, Integer id);

}

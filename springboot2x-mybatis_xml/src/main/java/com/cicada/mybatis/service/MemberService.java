package com.cicada.mybatis.service;

import com.cicada.mybatis.pojo.Member;

public interface MemberService {

    Member findMemberByName(String name);

}

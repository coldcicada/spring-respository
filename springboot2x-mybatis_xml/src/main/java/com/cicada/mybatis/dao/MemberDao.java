package com.cicada.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cicada.mybatis.pojo.Member;

@Mapper
public interface MemberDao {

    Member findMemberByName(@Param("name") String name);
}

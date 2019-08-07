package com.cicada.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cicada.mybatis.pojo.Member;

@Mapper
public interface MemberDao {

    @Select("SELECT * FROM t_member WHERE name = #{name}")
    Member findMemberByName(@Param("name") String name);

    @Select("SELECT * FROM t_member")
    List<Member> findAllMembers();

    @Insert("INSERT INTO t_member(name, age, money) VALUES(#{name}, #{age}, #{money})")
    void insertMember(@Param("name") String name, @Param("age") Integer age, @Param("money") Double money);

    @Update("UPDATE  t_member SET name = #{name}, age = #{age}, money= #{money} WHERE id = #{id}")
    void updateMember(@Param("name") String name, @Param("age") Integer age, @Param("money") Double money,
            @Param("id") int id);

    @Delete("DELETE from t_member WHERE id = #{id}")
    void deleteMember(@Param("id") Integer id);

}

package com.cicada.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cicada.mybatis.pojo.Member;
import com.cicada.mybatis.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/findAllUsers")
    public List<Member> findAllUsers() {
        return memberService.findAllMembers();
    }

    @GetMapping("/findMemberByName")
    public Member findMemberByName(@RequestParam("name") String name) {
        return memberService.findMemberByName(name);
    }

    @GetMapping("/updateMember")
    public String updateMember(@RequestParam("name") String name, @RequestParam("age") Integer age,
            @RequestParam("money") Double money, @RequestParam("id") Integer id) {
        memberService.updateMember(name, age, money, id);
        return "update successfully!";
    }

    @GetMapping("/insertMember")
    public String insertMember(@RequestParam("name") String name, @RequestParam("age") Integer age,
            @RequestParam("money") Double money) {
        memberService.insertMember(name, age, money);
        return "insert successfully!";
    }

    @GetMapping("/deleteMember")
    public String deleteMember(@RequestParam("id") Integer id) {
        memberService.deleteMember(id);
        return "delete successfully!";
    }
}

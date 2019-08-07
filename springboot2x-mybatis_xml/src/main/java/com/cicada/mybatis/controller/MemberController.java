package com.cicada.mybatis.controller;

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

    @GetMapping("/findMemberByName")
    public Member findMemberByName(@RequestParam("name") String name) {
        return memberService.findMemberByName(name);
    }

}

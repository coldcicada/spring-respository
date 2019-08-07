package com.ecicada.springboot.lombok.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserVO {
    private String name;
    private Integer age;
}

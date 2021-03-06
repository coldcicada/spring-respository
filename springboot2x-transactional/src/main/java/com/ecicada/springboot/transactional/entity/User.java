package com.ecicada.springboot.transactional.entity;

import lombok.Data;

/**
 * @author baihan
 * @Data 等同于@Getter + @Setter
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
}

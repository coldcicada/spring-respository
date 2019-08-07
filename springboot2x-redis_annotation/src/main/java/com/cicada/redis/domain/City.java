package com.cicada.redis.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long provinceId;
    private String cityName;
    private String description;
}

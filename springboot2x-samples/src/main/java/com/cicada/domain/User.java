package com.cicada.domain;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userEmail;

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userEmail="
                + userEmail + "]";
    }

}

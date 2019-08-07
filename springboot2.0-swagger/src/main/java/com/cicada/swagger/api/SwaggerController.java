package com.cicada.swagger.api;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api("Swagger控制器")
@RestController
public class SwaggerController {
    @ApiOperation("Swagger接口")
    @GetMapping("/getSwagger")
    public String getSwagger() {
        return "swagger index";
    }

    @ApiOperation("获取用户信息")
    @ApiImplicitParam(name = "username", value="用户信息参数", required = true,dataType = "String")
    @PostMapping("/getUserInfo")
    public String getUserInfo(String username) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("username", username);
        userMap.put("age", "23");
        System.out.println(userMap.toString());
        return userMap.toString();
    }
}

/** http://localhost:7470/swagger-ui.html#/swagger-controller */
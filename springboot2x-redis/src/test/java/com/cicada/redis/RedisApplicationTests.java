package com.cicada.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.cicada.redis.domain.User;
import com.cicada.redis.service.RedisServiceTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisServiceTemplate redisServiceTemplate;

    @Test
    public void test1() {
        stringRedisTemplate.opsForValue().getAndSet("SRKey", "springboot-redis");
    }

    @Test
    public void test2() {
        User user = new User();
        user.setId(1401);
        user.setName("Jerry");
        user.setPassword("123456");
        redisServiceTemplate.set("userK", user);
        System.out.println(redisServiceTemplate.get("userK", User.class));
    }

}

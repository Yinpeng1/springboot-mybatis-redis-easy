package com.yp.yptest.controller;

import com.yp.yptest.Entity.QuestionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.interceptor.SimpleKey;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public void test(){
        System.out.println("yinpeng");
        QuestionEntity e = new QuestionEntity();
        e.setQuestion("hello");
        e.setAnswer("world");
        redisTemplate.opsForValue().set(e.getQuestion(),e);
    }
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public void get(){
        System.out.println(redisTemplate.opsForValue().get("hello"));
    }
}

package com.example.demo.hxx.controller;

import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBucket;
import org.redisson.api.RKeys;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.Codec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {

    @Autowired
    RedissonClient redissonClient;


    @GetMapping("/testget")
    public void test() {
        RBucket<Object> test1 = redissonClient.getBucket("test1");
        System.out.println(test1);
        log.debug((String)test1.get());
    }
}

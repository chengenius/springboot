package com.mas.ds.controller;

import com.mas.ds.service.db1.UsersService;
import com.mas.ds.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    UsersService usersService;
    @Autowired
    RedisUtil redisUtil;

    @ResponseBody
    @RequestMapping("/test1")
    public List<Map<String, Integer>> test1() {
        List<Map<String, Integer>> list =  usersService.getAllCount();
        System.out.println(list);
        return list;
    }

    @ResponseBody
    @RequestMapping("/test2")
    public void test2(String key, String value) {
        System.out.println("请求参数 key: " + key);
        System.out.println("请求参数 value: " + value);

        boolean re = redisUtil.set(key, value);
        System.out.println(re);
    }


}

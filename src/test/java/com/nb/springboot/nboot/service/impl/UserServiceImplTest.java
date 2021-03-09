package com.nb.springboot.nboot.service.impl;

import com.nb.springboot.nboot.mapper.UserMapper;
import com.nb.springboot.nboot.pojo.User;
import com.nb.springboot.nboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author: nb
 * @Date: 2021/3/6 23:26
 * @Version 1.0
 */
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    UserService userService;
    @Autowired
    UserMapper userMapper;

    @Test
    public void testSelectById(){
        User user = userService.selectById(1l);
        System.out.println(user);
    }

    @Test
    public void selectByName(){
        List<User> userList = userMapper.selectUserByName("xunwukong");
        userList.forEach(System.out::println);
    }

    @Test
    public void insertOne(){
        Map<String,Object> map=new HashMap<>();
        map.put("name","jubajie");
        map.put("age",11);
        userMapper.insertOne(map);

    }
}
package com.nb.springboot.nboot.service.impl;

import com.nb.springboot.nboot.mapper.UserMapper;
import com.nb.springboot.nboot.pojo.User;
import com.nb.springboot.nboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: nb
 * @Date: 2021/3/6 23:25
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> selectUserByName(String name) {
        return userMapper.selectUserByName(name);
    }
}

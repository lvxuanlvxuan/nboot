package com.nb.springboot.nboot.service;

import com.nb.springboot.nboot.pojo.User;

import java.util.List;

/**
 * @Author: nb
 * @Date: 2021/3/6 23:23
 * @Version 1.0
 */
public interface UserService {

    User selectById(Long id);

    List<User> selectUserByName(String name);

}

package com.nb.springboot.nboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nb.springboot.nboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: nb
 * @Date: 2021/3/6 22:59
 * @Version 1.0
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    List<User> selectUserByName(@Param("name") String name);

    void insertOne(Map<String,Object> map);

    List<User> queryByMap(Map<String,Object> map);
}

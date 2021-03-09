package com.nb.springboot.nboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nb.springboot.nboot.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: nb
 * @Date: 2021/3/8 22:17
 * @Version 1.0
 */
@Repository
public interface StudentsMapper extends BaseMapper<Student> {

    int insertMany(List<Student> students);

    List<Student> selectIf(Map<String,Object> map);
}

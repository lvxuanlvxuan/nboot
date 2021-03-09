package com.nb.springboot.nboot.service.impl;

import com.nb.springboot.nboot.mapper.StudentsMapper;
import com.nb.springboot.nboot.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: nb
 * @Date: 2021/3/8 22:57
 * @Version 1.0
 */
@SpringBootTest
public class StudentTest {

    @Autowired
    StudentsMapper studentsMapper;

    @Test
    public void insertMany(){
        Student student1=new Student(123456789l,"小明",666666l);
        Student student2=new Student(223456789l,"小红",666666l);
        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        int many = studentsMapper.insertMany(studentList);
        System.out.println(many);
    }

    @Test
    public void selectIf(){
        Map<String,Object> map=new HashMap<>();
        map.put("name","小明");
        List<Student> studentList = studentsMapper.selectIf(map);
        studentList.forEach(System.out::println);
    }

}

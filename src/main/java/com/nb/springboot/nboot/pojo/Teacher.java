package com.nb.springboot.nboot.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: nb
 * @Date: 2021/3/8 22:15
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("教师实体类")
public class Teacher {

    @TableId
    private Long id;
    private String name;
    private List<Student> students;
}

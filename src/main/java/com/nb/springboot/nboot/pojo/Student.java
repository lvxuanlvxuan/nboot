package com.nb.springboot.nboot.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: nb
 * @Date: 2021/3/8 22:12
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("学生实体类")
public class Student {

    @TableId
    private Long id;
    private String name;
    private Long tId;
}

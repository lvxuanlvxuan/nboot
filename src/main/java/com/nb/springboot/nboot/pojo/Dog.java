package com.nb.springboot.nboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: nb
 * @Date: 2021/3/5 23:23
 * @Version 1.0
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog {

    @Value("11")
    private Integer age;
    @Value("旺财")
    private String name;

}

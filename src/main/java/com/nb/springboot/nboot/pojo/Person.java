package com.nb.springboot.nboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: nb
 * @Date: 2021/3/5 23:24
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = "classpath:nb.properties")
@Validated
public class Person {

//    @Value("${name}")
    private String name;
    private Integer age;
//    @Email(message = "邮箱格式校验失败")
    private String email;
    private Boolean happy;
    private Date brith;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}

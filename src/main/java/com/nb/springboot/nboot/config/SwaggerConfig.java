package com.nb.springboot.nboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Author: nb
 * @Date: 2021/3/6 23:41
 * @Version 1.0
 */
@Configuration //配置类
@EnableSwagger2// 开启Swagger2的自动配置
public class SwaggerConfig {

    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("test");
    }

    //配置swagger的docket的bean实例
    @Bean
    public Docket docket(Environment environment){

        //设置显示swagger的环境
        Profiles profiles=Profiles.of("dev","test");
        boolean flag=environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("nb")
                .apiInfo(apiInfo())
                //是否开启swagger
                .enable(flag)
                .select()
                /**
                 * RequestHandlerSelectors.配置扫描接口的方式
                 * .basePackage()：指定要扫描的包
                 * .any()：扫描全部
                 * .none()：不扫描
                 * .withClassAnnotation()：扫描类上的注解
                 * .withMethodAnnotation()：扫描方法上的注解
                 */
                .apis(RequestHandlerSelectors.basePackage("com.nb.springboot.nboot.controller"))
                //过滤什么路径
//                .paths(PathSelectors.ant("/nb/**"))
                .build();
    }

    //配置swagger的apiInfo
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact=new Contact("nb","https://blog.csdn.net/weixin_42317604?spm=1011.2124.3001.5343","m18105410261@163.com");
        return new ApiInfo(
                "nb的swaggerApi文档",
                "即使再小的帆也能远航",
                "v1.0",
                "https://blog.csdn.net/weixin_42317604?spm=1011.2124.3001.5343",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
                );
    }


}

package com.nb.springboot.nboot.controller;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.nb.springboot.nboot.result.Result;
import com.nb.springboot.nboot.result.ResultUtile;
import com.nb.springboot.nboot.service.UserService;
import com.nb.springboot.nboot.status.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: nb
 * @Date: 2021/3/6 23:33
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/user")
@Api(value = "查询用户信息",tags = "用户")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getOne")
    @ApiOperation(value = "根据ID查询用户")
    public Result getOne(@RequestParam("id") Long id){
        if(id==null){
            return null;
        }
        return ResultUtile.success(userService.selectById(id));
    }

    @GetMapping("/getByName")
    @ApiOperation(value = "根据用户名查询用户")
    public Result getByName(@RequestParam("name") String name){
        if(ObjectUtils.isEmpty(name)){
            return ResultUtile.failure(ResultCode.PARAM_IS_BLANK);
        }
        return ResultUtile.success(userService.selectUserByName(name));
    }


}

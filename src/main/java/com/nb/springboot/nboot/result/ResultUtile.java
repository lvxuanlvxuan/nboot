package com.nb.springboot.nboot.result;

import com.nb.springboot.nboot.status.ResultCode;

/**
 * @Author: nb
 * @Date: 2021/3/7 16:20
 * @Version 1.0
 */
public class ResultUtile {

    public static Result success(){
        Result result=new Result();
        result.setCode(0);
        result.setMessage("成功");
        return result;
    }

    public static Result success(Object data){
        Result result=new Result();
        result.setCode(0);
        result.setMessage("成功");
        result.setData(data);
        return result;
    }

    public static Result failure(ResultCode resultCode){
        Result result=new Result();
        result.setCode(resultCode.getCode());
        result.setMessage(resultCode.getMessage());
        return result;
    }

    public static Result failure(ResultCode resultCode,Object date){
        Result result=new Result();
        result.setMessage(resultCode.getMessage());
        result.setCode(resultCode.getCode());
        result.setData(date);
        return result;
    }


}

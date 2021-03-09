package com.nb.springboot.nboot.exception;

import com.nb.springboot.nboot.status.ResultCode;
import lombok.Data;

/**
 * @Author: nb
 * @Date: 2021/3/7 16:58
 * @Version 1.0
 */
@Data
public class NbException extends RuntimeException{

    private Integer code;

    public NbException(ResultCode resultCode){
        super(resultCode.getMessage());
        this.code=resultCode.getCode();
    }

    public NbException(Integer code,String message){
        super(message);
        this.code=code;
    }


}

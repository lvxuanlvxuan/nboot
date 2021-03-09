package com.nb.springboot.nboot.result;

import com.nb.springboot.nboot.status.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: nb
 * @Date: 2021/3/7 15:26
 * @Version 1.0
 */
@Data
public class Result<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;

}

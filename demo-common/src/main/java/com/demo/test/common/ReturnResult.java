package com.demo.test.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReturnResult<T> {

    public static final String CODE_SUCCESS = "200";
    public static final String CODE_AUTH_ERROR = "401";
    public static final String CODE_SYS_ERROR = "500";

    private String code;
    private String msg;
    private Object data;


    public static ReturnResult success() {
        return new ReturnResult(CODE_SUCCESS, "请求成功", null);
    }

    public static ReturnResult success(Object data) {
        return new ReturnResult(CODE_SUCCESS, "请求成功", data);
    }

    public static ReturnResult error(String msg) {
        return new ReturnResult(CODE_SYS_ERROR, msg, null);
    }

    public static ReturnResult error(String code, String msg) {
        return new ReturnResult(code, msg, null);
    }

    public static ReturnResult error() {
        return new ReturnResult(CODE_SYS_ERROR, "系统错误", null);
    }

}
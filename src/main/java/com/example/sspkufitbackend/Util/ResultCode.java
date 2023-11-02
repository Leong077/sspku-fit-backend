package com.example.sspkufitbackend.Util;

import com.alibaba.druid.sql.ast.expr.SQLIntegerExpr;

public enum ResultCode {

    SUCCESS(200, "Sucess"),
    ERROR(-100, "Error");

    private Integer code;
    private String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}

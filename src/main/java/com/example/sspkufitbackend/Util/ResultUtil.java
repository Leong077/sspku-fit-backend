package com.example.sspkufitbackend.Util;

public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(String msg) {
        return error(500, msg);
    }

    public static Result error() {
        return error(500, "未知错误");
    }

    public static Result error(Integer code) {
        return error(code, "未知错误");
    }

    public static Result error(ResultCode resultCode) {
        Result result = new Result();
        result.setCode(resultCode.getCode());
        result.setMsg(resultCode.getMsg());
        return result;
    }

}

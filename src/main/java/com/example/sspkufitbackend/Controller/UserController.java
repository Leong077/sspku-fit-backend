package com.example.sspkufitbackend.Controller;


import com.example.sspkufitbackend.Service.Impl.UserServiceImpl;
import com.example.sspkufitbackend.Util.Result;
import com.example.sspkufitbackend.Util.ResultUtil;
import com.example.sspkufitbackend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/login")
    public Result login(@RequestBody Map<String, String> requestBody) {
        String uact = requestBody.get("uact");
        String upwd = requestBody.get("upwd");

        String msg = userServiceImpl.loginService(uact, upwd);
        if (msg.equals("SUCCESS")) {
            return ResultUtil.success("登录成功");
        } else {
            return ResultUtil.error(msg);
        }
    }

    @RequestMapping("/register")
    public Result register(@RequestBody Map<String, String> requestBody) {
        String uname = requestBody.get("uname");
        String uact = requestBody.get("uact");
        String upwd = requestBody.get("upwd");

        String msg = userServiceImpl.registerService(new User(uname, uact, upwd));
        if (msg.equals("SUCCESS")) {
            return ResultUtil.success("注册成功");
        } else {
            return ResultUtil.error(msg);
        }
    }

}

package com.example.sspkufitbackend.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sspkufitbackend.Service.UserService;
import com.example.sspkufitbackend.mapper.UserMapper;
import com.example.sspkufitbackend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.repository.query.ExampleQueryMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String loginService(String uact, String upwd) {
        User user = userMapper.searchByAccount(uact);
        if (user != null) {
            if (user.getUpassword().equals(upwd)) {
                return "SUCCESS";
            } else {
                return "密码错误";
            }
        }
        return "用户不存在";
    }

    @Override
    public String registerService(User user) {
        User userNew = userMapper.searchByAccount(user.getUaccount());
        if (userNew == null) {
            if ("".equals(user.getUpassword())) {
                return "密码不能为空";
            } else if ("".equals(user.getUname())) {
                return "用户昵称不能为空";
            } else {
                userMapper.insert(user);
            }
        }
        return "用户已存在";
    }
}

package com.example.sspkufitbackend.Service;

import com.example.sspkufitbackend.pojo.User;


public interface UserService {

    public String loginService(String uact, String upwd);

    public String registerService(User user);
}

package com.example.sspkufitbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sspkufitbackend.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where uaccount = #{uaccount}")
    User searchByAccount(String uact);
}

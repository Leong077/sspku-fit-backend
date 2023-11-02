package com.example.sspkufitbackend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer uid;
    private String uname;
    private String uaccount;
    private String upassword;

    public User(String uname, String uaccount, String upassword) {
        this.uname = uname;
        this.uaccount = uaccount;
        this.upassword = upassword;
    }

}

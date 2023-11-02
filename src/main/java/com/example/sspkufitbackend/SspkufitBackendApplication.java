package com.example.sspkufitbackend;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.example.sspkufitbackend.mapper")
@EnableTransactionManagement
public class SspkufitBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SspkufitBackendApplication.class, args);
    }

}

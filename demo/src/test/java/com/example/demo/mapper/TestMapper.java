package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMapper {
    @Autowired
    UserMapper userMapper;
    @Test
    public void test() {
        userMapper.selectList(null).forEach(System.out::println);
    }
}

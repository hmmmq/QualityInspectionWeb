package com.example.demo.service;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xxx
 * @since 2024-09-03
 */
public interface IUserService extends IService<User> {

    User findByUsernameAndPassword(String username, String password);
}

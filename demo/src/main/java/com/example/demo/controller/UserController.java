package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xxx
 * @since 2024-09-03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @PostMapping("/login")
    public User login(@RequestBody User user) {

        User foundUser = userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (foundUser != null) {
            return foundUser;
        } else {
            return null;
        }
    }


    @PostMapping
    public User create(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @GetMapping
    public List<User> read() {
        return userService.list();
    }

    @PutMapping("/{username}")
    public User update(@PathVariable String username, @RequestBody User user) {
        user.setUsername(username);
        userService.updateById(user);
        return user;
    }

    @DeleteMapping("/{username}")
    public void delete(@PathVariable String username) {
        userService.removeById(username);
    }
}
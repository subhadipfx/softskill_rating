package com.softskill.rating.assignment.controller;

import com.softskill.rating.assignment.service.user.UserService;
import com.softskill.rating.assignment.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<User> users(){
        return this.userService.getUsers();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user){
        return this.userService.createUser(user);
    }
}

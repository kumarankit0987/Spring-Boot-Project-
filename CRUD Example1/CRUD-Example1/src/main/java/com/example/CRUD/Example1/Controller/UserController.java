package com.example.CRUD.Example1.Controller;

import com.example.CRUD.Example1.Entity.User;
import com.example.CRUD.Example1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUser(){

        return userService.getAllUser();
    }

    @PostMapping("/users")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable int id){
        userService.deleteUserById(id);
        return "User deleted Successfully";
    }
}

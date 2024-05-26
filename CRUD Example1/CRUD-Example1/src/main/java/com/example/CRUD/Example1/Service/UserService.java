package com.example.CRUD.Example1.Service;

import com.example.CRUD.Example1.Entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {

    List<User> userList = new ArrayList<>();
    public List<User> getAllUser(){
//        User user1 = new User("Ram",'M',123, 9132456709L);
//        User user2 = new User("Ankit",'M',235,9142227603L);
//
//        userList.add(user1);
//        userList.add(user2);
        return userList;
    }

    public String addUser(User user) {
        userList.add(user);
        return "User Added Successfully";
    }

    public User getUserById(int id) {

        for(User user : userList){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public void deleteUserById(int id) {
        Iterator<User> iterator = userList.iterator();
        User user = iterator.next();
        if(user.getId()==id){
            iterator.remove();
        }
    }
}

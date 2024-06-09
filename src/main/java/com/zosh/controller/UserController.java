package com.zosh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zosh.models.User; // Correct import statement

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        User user1 = new User(1,"talukdre", "siam", "dlsjf", "slkdflk");
        User user2 = new User(2,"sabin", "siam", "dlsjf", "slkdflk");
        users.add(user1);
        users.add(user2);
        return users;
    }
        
        @GetMapping("/users/{userid}")
        public User getUsersById(@PathVariable("userid")Integer id) {
            List<User> users = new ArrayList<>();

            User user1 = new User(1,"talukdre", "siam", "siam@gmail.com", "123456");
         
            users.add(user1);
      
            return user1;
        }
    
}

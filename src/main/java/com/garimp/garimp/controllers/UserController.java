package com.garimp.garimp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garimp.garimp.entities.User;
import com.garimp.garimp.services.UserService;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")

public class UserController {
    @Autowired 
    UserService service ;
    
    @GetMapping  
    public List<User> listUsers() {


        return service.findAllUsers();

    }
    
    @PostMapping
    public User user(@RequestBody User user){

        return service.saveUser(user);

    }
}

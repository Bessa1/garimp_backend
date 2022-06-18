package com.garimp.garimp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garimp.garimp.entities.User;
import com.garimp.garimp.repositories.UserRepository;

@Service
public class UserService {
    @Autowired 
    private UserRepository repository;

    public List <User> findAllUsers(){
        return this.repository.findAll();
    }
    public User  saveUser(User user){
        return this.repository.save(user);
    } 

}

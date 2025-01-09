package com.thiago.bagugatreino.service;

import com.thiago.bagugatreino.entity.User;
import com.thiago.bagugatreino.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;


    public User create(User user){
        return repository.save(user);
    }

    public Iterable<User> getAll(){
        return repository.findAll();
    }

}
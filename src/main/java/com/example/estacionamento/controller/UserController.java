package com.example.estacionamento.controller;

import com.example.estacionamento.entities.User;
import com.example.estacionamento.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (name = "/user")
public class UserController {

    @Autowired
    private UserRepository repository;
    @GetMapping
   public List<User> findAll(){
       List<User> result = repository.findAll();
       return result;
   }
}

package com.example.demo.service;


import com.example.demo.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String test() {
        return "Hello from service";
    }
}



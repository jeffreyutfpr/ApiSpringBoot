package com.apirastreamento.rastreamento.controller;

import com.apirastreamento.rastreamento.entity.User;
import com.apirastreamento.rastreamento.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private ServiceUser serviceUser;


    @Autowired
    public UserController(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }
}

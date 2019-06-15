package com.adammendak.crosswords.controller;

import com.adammendak.crosswords.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class UserController {

    @Autowired
    private UserService userService;



}

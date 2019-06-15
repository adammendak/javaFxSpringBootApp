package com.adammendak.crosswords.controller;

import com.adammendak.crosswords.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


}

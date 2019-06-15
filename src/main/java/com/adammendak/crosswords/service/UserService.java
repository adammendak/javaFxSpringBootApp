package com.adammendak.crosswords.service;

import com.adammendak.crosswords.domain.User;
import com.adammendak.crosswords.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
        log.info("####User saved:" + user.toString());
    }

}

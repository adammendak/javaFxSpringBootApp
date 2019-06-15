package com.adammendak.crosswords.service;

import com.adammendak.crosswords.domain.User;
import com.adammendak.crosswords.repository.CrosswordEntryRepository;
import com.adammendak.crosswords.repository.UserRepository;
import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    private final CrosswordEntryRepository crosswordEntryRepository;

    public void saveUser(User user) {
        userRepository.save(user);
        log.info("####User saved:" + user.toString());
    }

    public List<User> getAllUsers() {
        return Lists.newArrayList(userRepository.findAll());
    }

    public User getUserByName(String userName) {
        return userRepository.findByUserName(userName).orElse(null);
    }

    @Transactional
    public void deleteAllCrossEntriesForUser(User user) {
        log.info("#### deleting all entires for user : " + user.getUserName());
        Optional<User> userOptional = userRepository.findByUserName(user.getUserName());
        userOptional.ifPresent(x -> {
            x.getEntries().forEach(crosswordEntryRepository::delete);
            x.getEntries().clear();
            userRepository.save(x);
        });
    }

}

package com.adammendak.crosswords.service;

import com.adammendak.crosswords.domain.CrosswordEntry;
import com.adammendak.crosswords.domain.User;
import com.adammendak.crosswords.repository.CrosswordEntryRepository;
import com.adammendak.crosswords.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CrosswordEntryService {

    private final CrosswordEntryRepository crosswordEntryRepository;
    private final UserRepository userRepository;

    public void saveCrossword(CrosswordEntry crosswordEntry) {
     crosswordEntryRepository.save(crosswordEntry);
     log.info("#### saved entry= " + crosswordEntry.toString());
    }

    @Transactional
    public void deleteByUserName(User user) {
        crosswordEntryRepository.deleteAllByUser(user);
        log.info("#### deleting all by username : " + user.getUserName());
    }

}

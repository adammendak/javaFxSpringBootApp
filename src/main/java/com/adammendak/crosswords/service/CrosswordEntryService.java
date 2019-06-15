package com.adammendak.crosswords.service;

import com.adammendak.crosswords.domain.CrosswordEntry;
import com.adammendak.crosswords.repository.CrosswordEntryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CrosswordEntryService {

    private final CrosswordEntryRepository crosswordEntryRepository;

    public void saveCrossword(CrosswordEntry crosswordEntry) {
     crosswordEntryRepository.save(crosswordEntry);
     log.info("#### saved entry= " + crosswordEntry.toString());
    }
}

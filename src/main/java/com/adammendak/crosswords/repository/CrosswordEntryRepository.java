package com.adammendak.crosswords.repository;

import com.adammendak.crosswords.domain.CrosswordEntry;
import com.adammendak.crosswords.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrosswordEntryRepository extends CrudRepository<CrosswordEntry, Long> {

    void deleteAllByUser(User user);

    List<CrosswordEntry> findAllByUser (User user);
}

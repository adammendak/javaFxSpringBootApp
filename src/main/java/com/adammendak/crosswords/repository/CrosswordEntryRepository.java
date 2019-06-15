package com.adammendak.crosswords.repository;

import com.adammendak.crosswords.domain.CrosswordEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrosswordEntryRepository extends CrudRepository<CrosswordEntry, Long> {
}

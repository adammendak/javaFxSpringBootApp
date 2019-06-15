package com.adammendak.crosswords.repository;

import com.adammendak.crosswords.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUserName(String userName);
}

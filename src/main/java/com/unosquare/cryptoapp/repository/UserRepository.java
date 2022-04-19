package com.unosquare.cryptoapp.repository;

import com.unosquare.cryptoapp.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, Long> {

    Optional<User> findItemByEmail(final String email);
}

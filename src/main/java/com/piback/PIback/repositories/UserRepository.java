package com.piback.PIback.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

import com.piback.PIback.models.User;

public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findAll();

    Optional<User> findOneByEmail(String email);
}

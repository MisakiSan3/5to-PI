package com.piback.PIback.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import com.piback.PIback.models.User;

public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findAll();
}

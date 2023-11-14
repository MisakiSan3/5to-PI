package com.piback.PIback.repositories;

import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.User;
public interface UserRepository extends CrudRepository<User,Long> {
    
}

package com.piback.PIback.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.Profile;


public interface ProfileRepository extends CrudRepository<Profile,Long> {
    List<Profile> findAll();
}

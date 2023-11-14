package com.piback.PIback.repositories;
import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.Activity;

import java.util.List;


public interface ActivityRepository extends CrudRepository < Activity, Long> {

    List <Activity> findAll();

    

}

    
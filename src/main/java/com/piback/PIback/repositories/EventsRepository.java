package com.piback.PIback.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.Events;

public interface EventsRepository extends CrudRepository<Events,Long> {
    List<Events> findAll();
}

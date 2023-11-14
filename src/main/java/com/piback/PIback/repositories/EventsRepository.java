package com.piback.PIback.repositories;

import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.Events;

public interface EventsRepository extends CrudRepository<Events,Long> {
    
}

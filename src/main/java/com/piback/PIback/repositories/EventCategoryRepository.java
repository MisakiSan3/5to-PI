package com.piback.PIback.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.EventCategory;


public interface EventCategoryRepository extends CrudRepository<EventCategory,Long> {
    List<EventCategory> findAll();
}

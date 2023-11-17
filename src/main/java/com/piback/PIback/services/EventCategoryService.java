package com.piback.PIback.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piback.PIback.models.EventCategory;
import com.piback.PIback.repositories.EventCategoryRepository;

@Service
public class EventCategoryService {
     @Autowired
    private EventCategoryRepository eventCategoryRepository;

     public EventCategory saveEventCategory(EventCategory EventCategory){

        return eventCategoryRepository.save(EventCategory);
    }

    public EventCategory findById(long id)
    {
        return eventCategoryRepository.findById(id).orElse(null);
    }
    
    public void deleteByID (long id)
    {
        eventCategoryRepository.deleteById(id);
    }

    public List<EventCategory> findAll()
    {
        return eventCategoryRepository.findAll();
    }
}

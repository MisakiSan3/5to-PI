package com.piback.PIback.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piback.PIback.models.Events;
import com.piback.PIback.repositories.EventsRepository;

@Service
public class EventsService {
    @Autowired
    private EventsRepository eventsRepository;

     public Events saveEvents(Events Events){

        return eventsRepository.save(Events);
    }

    public Events findById(long id)
    {
        return eventsRepository.findById(id).orElse(null);
    }
    
    public void deleteByID (long id)
    {
        eventsRepository.deleteById(id);
    }

    public Iterable<Events> findAll()
    {
        return eventsRepository.findAll();
    }
}

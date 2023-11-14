package com.piback.PIback.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piback.PIback.models.Activity;
import com.piback.PIback.repositories.ActivityRepository;

@Service
public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    //create
    public Activity save(Activity entity)
    {
        return activityRepository.save(entity);
    }

    //read
    public Activity findById(long id)
    {
        return activityRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteByID (long id)
    {
        activityRepository.deleteById(id);
    }
    //
    
    //select all
    public List <Activity> findAll()
    {
        return activityRepository.findAll();
    }
    
}

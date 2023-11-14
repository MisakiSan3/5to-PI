package com.piback.PIback.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.piback.PIback.models.Profile;
import com.piback.PIback.repositories.ProfileRepository;

public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;


    public Profile saveProfile(Profile institucion){

        return profileRepository.save(institucion);
    }

    public Profile findById(long id)
    {
        return profileRepository.findById(id).orElse(null);
    }
    
    public void deleteByID (long id)
    {
        profileRepository.deleteById(id);
    }

    public Iterable<Profile> findAll()
    {
        return profileRepository.findAll();
    }
}

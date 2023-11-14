package com.piback.PIback.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.piback.PIback.models.Section;
import com.piback.PIback.repositories.SectionRepository;



public class SectionService {
    @Autowired
    private SectionRepository sectionRepository;

    //create
    public Section save(Section entity)
    {
        return sectionRepository.save(entity);
    }

    //read
    public Section findById(long id)
    {
        return sectionRepository.findById(id).orElse(null);
    }

    //delete
    public void deleteByID (long id)
    {
        sectionRepository.deleteById(id);
    }
    //
    
    //select all
    public List <Section> findAll()
    {
        return sectionRepository.findAll();
    }
}

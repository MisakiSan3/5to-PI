package com.piback.PIback.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piback.PIback.models.Subject;
import com.piback.PIback.repositories.SubjectRepository;


@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;


    public Subject saveSubjectRepository(Subject Subject){

        return subjectRepository.save(Subject);
    }

    public Subject findById(long id)
    {
        return subjectRepository.findById(id).orElse(null);
    }
    
    public void deleteByID (long id)
    {
        subjectRepository.deleteById(id);
    }
    public Iterable<Subject> findAll()
    {
        return subjectRepository.findAll();
    }
}

package com.piback.PIback.repositories;

import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.Subject;

public interface SubjectRepository extends CrudRepository<Subject,Long> {
    
}

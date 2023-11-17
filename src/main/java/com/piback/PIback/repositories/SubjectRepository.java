package com.piback.PIback.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.Subject;

public interface SubjectRepository extends CrudRepository<Subject,Long> {
    List<Subject> findAll();
}

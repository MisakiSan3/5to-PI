package com.piback.PIback.repositories;

import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher,Long> {
    
}

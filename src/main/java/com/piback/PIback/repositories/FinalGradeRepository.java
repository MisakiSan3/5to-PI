package com.piback.PIback.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.FinalGrade;

public interface FinalGradeRepository extends CrudRepository<FinalGrade,Long> {
    List<FinalGrade> findAll();
}

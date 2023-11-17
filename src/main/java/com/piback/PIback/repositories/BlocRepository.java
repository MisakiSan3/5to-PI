package com.piback.PIback.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.Bloc;

public interface BlocRepository extends CrudRepository<Bloc,Long>{
    List<Bloc> findAll();
}

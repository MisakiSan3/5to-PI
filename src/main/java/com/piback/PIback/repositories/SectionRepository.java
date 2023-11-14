package com.piback.PIback.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.piback.PIback.models.Section;

public interface SectionRepository extends CrudRepository < Section, Long> {

    List <Section> findAll();

    

}
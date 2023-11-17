package com.piback.PIback.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piback.PIback.models.Teacher;
import com.piback.PIback.repositories.TeacherRepository;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher saveTeacher(Teacher Teacher){

        return teacherRepository.save(Teacher);
    }

    public Teacher findById(long id)
    {
        return teacherRepository.findById(id).orElse(null);
    }
    
    public void deleteByID (long id)
    {
        teacherRepository.deleteById(id);
    }

    public List<Teacher> findAll()
    {
        return teacherRepository.findAll();
    }
}

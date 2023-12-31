package com.piback.PIback.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piback.PIback.models.Bloc;
import com.piback.PIback.repositories.BlocRepository;

@Service
public class BlocService {
    @Autowired
    private BlocRepository blocRepository;


    public Bloc saveBloc(Bloc institucion){

        return blocRepository.save(institucion);
    }

    public Bloc findById(long id)
    {
        return blocRepository.findById(id).orElse(null);
    }
    
    public void deleteByID (long id)
    {
        blocRepository.deleteById(id);
    }

    public List<Bloc> findAll()
    {
        return blocRepository.findAll();
    }
}

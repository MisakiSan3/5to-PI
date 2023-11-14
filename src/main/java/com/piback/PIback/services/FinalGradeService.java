package com.piback.PIback.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piback.PIback.models.FinalGrade;
import com.piback.PIback.repositories.FinalGradeRepository;

@Service
public class FinalGradeService {
    @Autowired
    private FinalGradeRepository finalGradeRepository;


    public FinalGrade saveFinalGrade(FinalGrade finalGrade){

        return finalGradeRepository.save(finalGrade);
    }

    public FinalGrade findById(long id)
    {
        return finalGradeRepository.findById(id).orElse(null);
    }
    
    public void deleteByID (long id)
    {
        finalGradeRepository.deleteById(id);
    }

    public Iterable<FinalGrade> findAll()
    {
        return finalGradeRepository.findAll();
    }
}

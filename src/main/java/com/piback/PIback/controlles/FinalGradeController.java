package com.piback.PIback.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piback.PIback.models.FinalGrade;
import com.piback.PIback.services.FinalGradeService;

@RestController
@RequestMapping("api/finalgrade")
@CrossOrigin({"*"})
public class FinalGradeController {
     @Autowired
    private FinalGradeService FinalGradeService;

    @PostMapping("/save")
    public FinalGrade saveProveedores(@RequestBody FinalGrade entity) {
        
        
        return FinalGradeService.saveFinalGrade(entity);
    }

     @GetMapping("/{id}")
    public FinalGrade findProveedores(@PathVariable long id)
    {
        return FinalGradeService.findById(id);
    }
    @PutMapping("/{id}")
    public FinalGrade update(@RequestBody FinalGrade entity)
    {
        return FinalGradeService.saveFinalGrade(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id)
    {
        FinalGradeService.deleteByID(id);
    }

    @GetMapping("/")
    public Iterable<FinalGrade> findAll()
    {
        return FinalGradeService.findAll();
    }
}

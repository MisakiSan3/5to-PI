package com.piback.PIback.controlles;

import java.util.List;

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

import com.piback.PIback.models.Subject;
import com.piback.PIback.services.SubjectService;

@RestController
@RequestMapping("api/subject")
@CrossOrigin({"*"})
public class SubjectController {
     @Autowired
    private SubjectService subjectService;

    @PostMapping("/save")
    public Subject saveProveedores(@RequestBody Subject entity) {
        
        
        return subjectService.saveSubjectRepository(entity);
    }

     @GetMapping("/{id}")
    public Subject findProveedores(@PathVariable long id)
    {
        return subjectService.findById(id);
    }
    @PutMapping("/{id}")
    public Subject update(@RequestBody Subject entity)
    {
        return subjectService.saveSubjectRepository(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id)
    {
        subjectService.deleteByID(id);
    }

    @GetMapping("/")
    public List<Subject> findAll()
    {
        return subjectService.findAll();
    }
}

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

import com.piback.PIback.models.Teacher;
import com.piback.PIback.services.TeacherService;

@RestController
@RequestMapping("api/teacher")
@CrossOrigin({"*"})
public class TeacherController {
     @Autowired
    private TeacherService teacherService;

    @PostMapping("/save")
    public Teacher saveProveedores(@RequestBody Teacher entity) {
        
        
        return teacherService.saveTeacher(entity);
    }

     @GetMapping("/{id}")
    public Teacher findProveedores(@PathVariable long id)
    {
        return teacherService.findById(id);
    }
    @PutMapping("/{id}")
    public Teacher update(@RequestBody Teacher entity)
    {
        return teacherService.saveTeacher(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id)
    {
        teacherService.deleteByID(id);
    }

    @GetMapping("/")
    public List<Teacher> findAll()
    {
        return teacherService.findAll();
    }
}

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

import com.piback.PIback.models.Section;

import com.piback.PIback.services.SectionService;


@RestController
@RequestMapping("api/Section")
@CrossOrigin({"*"})

public class SectionController {
    @Autowired 
    private SectionService sectionService;

    @PostMapping("/save")

    public Section save(@RequestBody Section entity)
    {
        return sectionService.save(entity);
    }

    @GetMapping("/{id}/")
    public Section findSection(@PathVariable long id)
    {
        return sectionService.findById(id);
    }
    @PutMapping("/{id}/")
    public Section update(@RequestBody Section entity)
    {
        return sectionService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteByID(@PathVariable long id)
    {
        sectionService.deleteByID(id);
    }

    @GetMapping("/")
    public List<Section> findAll()
    {
        return sectionService.findAll();
    }
}

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

import com.piback.PIback.models.EventCategory;
import com.piback.PIback.services.EventCategoryService;

@RestController
@RequestMapping("api/eventscategory")
@CrossOrigin({"*"})
public class EventCategoryController {
    @Autowired
    private EventCategoryService eventCategoryService;

     @PostMapping("/save")
    public EventCategory saveeventCategory(@RequestBody EventCategory entity) {
        
        return eventCategoryService.saveEventCategory(entity);
    }

     @GetMapping("/{id}")
    public EventCategory findeventCategory(@PathVariable long id)
    {
        return eventCategoryService.findById(id);
    }

    @PutMapping("/{id}")
    public EventCategory update(@RequestBody EventCategory entity)
    {
        return eventCategoryService.saveEventCategory(entity);
    }

     @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id)
    {
        eventCategoryService.deleteByID(id);
    }

    @GetMapping("/")
    public Iterable<EventCategory> findAll()
    {
        return eventCategoryService.findAll();
    }
}

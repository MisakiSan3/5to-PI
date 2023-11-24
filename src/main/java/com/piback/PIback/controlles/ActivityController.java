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

import com.piback.PIback.models.Activity;
import com.piback.PIback.services.ActivityService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("api/Activity")
@CrossOrigin({"*"})

public class ActivityController {
    @Autowired 
    private ActivityService activityService;
    @Operation(summary = "post activity", description = "Guarda actividades")
    @PostMapping("/save")
    public Activity save(@RequestBody Activity entity)
    {
        return activityService.save(entity);
    }

    @GetMapping("/{id}/")
    public Activity findActivity(@PathVariable long id)
    {
        return activityService.findById(id);
    }
    @PutMapping("/{id}/")
    public Activity update(@RequestBody Activity entity)
    {
        return activityService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteByID(@PathVariable long id)
    {
        activityService.deleteByID(id);
    }

    @GetMapping("/")
    public List<Activity> findAll()
    {
        return activityService.findAll();
    }
}
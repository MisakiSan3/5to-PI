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

import com.piback.PIback.models.Bloc;
import com.piback.PIback.services.BlocService;

@RestController
@RequestMapping("api/bloc")
@CrossOrigin({"*"})
public class BlocController {
    @Autowired
    private BlocService blocService;

    @PostMapping("/save")
    public Bloc saveBloc(@RequestBody Bloc entity) {
        
        
        return blocService.saveBloc(entity);
    }

     @GetMapping("/{id}")
    public Bloc findBloc(@PathVariable long id)
    {
        return blocService.findById(id);
    }
    @PutMapping("/{id}")
    public Bloc update(@RequestBody Bloc entity)
    {
        return blocService.saveBloc(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id)
    {
        blocService.deleteByID(id);
    }

    @GetMapping("/")
    public Iterable<Bloc> findAll()
    {
        return blocService.findAll();
    }
}

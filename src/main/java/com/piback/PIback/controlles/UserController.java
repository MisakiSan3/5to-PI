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

import com.piback.PIback.models.User;
import com.piback.PIback.services.UserService;

@RestController
@RequestMapping("api/user")
@CrossOrigin({"*"})
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody User entity) {
        
        
        return userService.saveUser(entity);
    }

     @GetMapping("/{id}")
    public User findUser(@PathVariable long id)
    {
        return userService.findById(id);
    }
    @PutMapping("/{id}")
    public User update(@RequestBody User entity)
    {
        return userService.saveUser(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id)
    {
        userService.deleteByID(id);
    }

    @GetMapping("/")
    public List<User> findAll()
    {
        return userService.findAll();
    }
}

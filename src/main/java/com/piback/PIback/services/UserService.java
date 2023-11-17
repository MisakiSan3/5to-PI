package com.piback.PIback.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piback.PIback.models.User;
import com.piback.PIback.repositories.UserRepository;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User saveUser(User institucion){

        return userRepository.save(institucion);
    }

    public User findById(long id)
    {
        return userRepository.findById(id).orElse(null);
    }
    
    public void deleteByID (long id)
    {
        userRepository.deleteById(id);
    }

    public List<User> findAll()
    {
        return userRepository.findAll();
    }
}

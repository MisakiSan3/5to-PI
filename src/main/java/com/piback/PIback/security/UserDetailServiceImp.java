package com.piback.PIback.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.piback.PIback.models.User;
import com.piback.PIback.repositories.UserRepository;

@Service
public class UserDetailServiceImp implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       User user = userRepository.findOneByEmail(email).orElseThrow(()-> new UsernameNotFoundException("Usuario no existe"));
        return new UserDetailsImp(user);
    }
    
    
}

package com.piback.PIback.controlles.Auth;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/auth")
@CrossOrigin({"*"})
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

   /* @PostMapping(value="login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request)
    {
        return ResponseEntity.ok(authService.login(request));
    }*/

    @PostMapping(value="register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request)
    {
        System.out.println(request.getUsername());
        return ResponseEntity.ok(authService.register(request));
    }
    
}

package com.piback.PIback.controlles.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor

public class RegisterRequest {
    String username;
    String email;
    String password;
}

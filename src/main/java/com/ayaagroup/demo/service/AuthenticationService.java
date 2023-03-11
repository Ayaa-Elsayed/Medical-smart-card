package com.ayaagroup.demo.service;

import com.ayaagroup.demo.dto.JwtResponse;
import com.ayaagroup.demo.dto.LoginRequest;
import com.ayaagroup.demo.dto.SignupRequest;

public interface AuthenticationService {

    JwtResponse authenticate(LoginRequest loginRequest);

    void signup(SignupRequest signupRequest);
}

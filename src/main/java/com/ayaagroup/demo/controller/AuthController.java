package com.ayaagroup.demo.controller;


import com.ayaagroup.demo.dto.JwtResponse;
import com.ayaagroup.demo.dto.LoginRequest;
import com.ayaagroup.demo.dto.SignupRequest;
import com.ayaagroup.demo.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService authenticationService;


    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        JwtResponse jwtResponse = authenticationService.authenticate(loginRequest);

        return ResponseEntity.ok(jwtResponse);
    }

    @GetMapping("/signup")
    public void signup(@RequestBody SignupRequest signupRequest) {
       authenticationService.signup(signupRequest);
    }


}

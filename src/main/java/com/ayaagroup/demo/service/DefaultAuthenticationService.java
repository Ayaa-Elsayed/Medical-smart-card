package com.ayaagroup.demo.service;

import com.ayaagroup.demo.dto.JwtResponse;
import com.ayaagroup.demo.dto.LoginRequest;
import com.ayaagroup.demo.dto.SignupRequest;
import com.ayaagroup.demo.entity.user.User;
import com.ayaagroup.demo.entity.user.patient.Patient;
import com.ayaagroup.demo.repository.UserRepository;
import com.ayaagroup.demo.utility.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class DefaultAuthenticationService implements AuthenticationService {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;

    @Override
    public JwtResponse authenticate(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        //hwa hna eh fayded el builder leh mba3ml4 object mn el JwtResponse we b assign gwah el JWT ??
        return JwtResponse.builder()
                .jwtToken(jwt)
                .build();
    }

    @Override
    public void signup(SignupRequest signupRequest) {
        if (userRepository.existsByUserName(signupRequest.getUsername())) {
            throw new RuntimeException("User is already exist");
        }

        User user = User.builder()
                .userName(signupRequest.getUsername())
                .userPass(encoder.encode(signupRequest.getPassword()))
                .build();

        userRepository.save(user);
    }
}

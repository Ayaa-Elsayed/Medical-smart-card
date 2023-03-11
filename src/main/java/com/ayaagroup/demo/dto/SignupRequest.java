package com.ayaagroup.demo.dto;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class SignupRequest {
    private String username;

    private String password;

    private String email;
}

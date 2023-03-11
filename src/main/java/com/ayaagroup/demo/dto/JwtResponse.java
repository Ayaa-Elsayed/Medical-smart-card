package com.ayaagroup.demo.dto;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class JwtResponse {
    private String jwtToken;
}

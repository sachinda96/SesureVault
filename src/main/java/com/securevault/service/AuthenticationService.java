package com.securevault.service;

import com.securevault.dto.JwtAuthenticationResponse;
import com.securevault.dto.SignUpRequest;
import com.securevault.dto.SigninRequest;

public interface AuthenticationService {

    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}

package com.theanh.booknetwork.service;

import com.theanh.booknetwork.dto.request.AuthenticationRequest;
import com.theanh.booknetwork.dto.request.RegistrationRequest;
import com.theanh.booknetwork.dto.response.AuthenticationResponse;
import jakarta.mail.MessagingException;

public interface AuthenticationService {
    void register(RegistrationRequest request) throws MessagingException;
    AuthenticationResponse authenticate(AuthenticationRequest request);
    void activateAccount(String token) throws MessagingException;
}

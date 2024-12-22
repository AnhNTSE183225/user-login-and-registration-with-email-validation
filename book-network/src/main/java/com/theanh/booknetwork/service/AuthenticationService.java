package com.theanh.booknetwork.service;

import com.theanh.booknetwork.dto.request.RegistrationRequest;
import jakarta.mail.MessagingException;

public interface AuthenticationService {
    void register(RegistrationRequest request) throws MessagingException;
}

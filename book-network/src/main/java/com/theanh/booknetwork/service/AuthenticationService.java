package com.theanh.booknetwork.service;

import com.theanh.booknetwork.dto.request.RegistrationRequest;

public interface AuthenticationService {
    void register(RegistrationRequest request);
}

package com.theanh.booknetwork.dto.response;

import lombok.Builder;

@Builder
public record AuthenticationResponse(
        String token
) {
}

package com.example.application.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class RegistrationService {
    private final String fistName;
    private final String lastName;
    private final String password;
    private final String email;

    public String register(RegistrationRequest request) {
        return "works";
    }
}

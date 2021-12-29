package io.hamdev.conference.service;

import io.hamdev.conference.model.Registration;

import java.util.List;

public interface RegistrationService {
    Registration addRegistration(Registration registration);

    List<Registration> findAll();
}

package io.hamdev.conference.repository;

import io.hamdev.conference.model.Registration;
import io.hamdev.conference.model.RegistrationReport;

import java.util.List;

public interface RegistrationRepository {
    Registration save(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}

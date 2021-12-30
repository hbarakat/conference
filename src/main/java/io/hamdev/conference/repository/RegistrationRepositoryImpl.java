package io.hamdev.conference.repository;

import io.hamdev.conference.model.Registration;
import io.hamdev.conference.model.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static io.hamdev.conference.model.Registration.REGISTRATION_REPORT;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Registration save(Registration registration) {
        entityManager.persist(registration);
        return registration;
    }

    @Override
    public List<Registration> findAll() {
        return entityManager.createQuery("SELECT r FROM Registration r").getResultList();
    }

    @Override
    public List<RegistrationReport> findAllReports() {
        String jpql= "Select new io.hamdev.conference.model.RegistrationReport"+
                "(r.name, c.name, c.description) " +
                "from Registration r, Course c " +
                "where r.id = c.registration.id";
        return entityManager.createNamedQuery(REGISTRATION_REPORT).getResultList();
    }
}
// End of file
// Path source: src/main/java/io/hamdev/conference/controller/repository/RegistrationRepositoryImpl.java


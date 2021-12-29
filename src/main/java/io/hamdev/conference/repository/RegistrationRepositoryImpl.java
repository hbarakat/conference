package io.hamdev.conference.repository;

import io.hamdev.conference.model.Registration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

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
}
// End of file
// Path source: src/main/java/io/hamdev/conference/controller/repository/RegistrationRepositoryImpl.java


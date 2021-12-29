package io.hamdev.conference.service;

import io.hamdev.conference.repository.CourseRepository;
import io.hamdev.conference.repository.RegistrationRepository;
import io.hamdev.conference.model.Course;
import io.hamdev.conference.model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {
  @Autowired
  private RegistrationRepository registrationRepository;
  @Autowired
  private CourseRepository courseRepository;
  @Override
  @Transactional
  public Registration addRegistration(Registration registration) {
      registration= registrationRepository.save(registration);
Course course=new Course();

    course.setName("Java");
    course.setDescription("Java");
      course.setRegistration(registration);

      courseRepository.save(course);

     return registration;
  }

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }
}

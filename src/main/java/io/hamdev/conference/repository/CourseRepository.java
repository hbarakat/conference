package io.hamdev.conference.repository;

import io.hamdev.conference.model.Course;

public interface CourseRepository {
    Course save(Course course);
}

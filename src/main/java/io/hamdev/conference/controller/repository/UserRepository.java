package io.hamdev.conference.controller.repository;

import io.hamdev.conference.model.User;

public interface UserRepository {
    User save(User user);
}

package io.hamdev.conference.repository;

import io.hamdev.conference.model.User;

public interface UserRepository {
    User save(User user);
}

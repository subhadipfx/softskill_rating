package com.softskill.rating.assignment.service.user;

import com.softskill.rating.assignment.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers();
    User createUser(User user);
    Optional<User> getUser(Long id);
}

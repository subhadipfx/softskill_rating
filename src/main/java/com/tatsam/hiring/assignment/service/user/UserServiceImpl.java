package com.tatsam.hiring.assignment.service.user;

import com.tatsam.hiring.assignment.models.User;
import com.tatsam.hiring.assignment.repository.UserRepository;
import com.tatsam.hiring.assignment.service.utility.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        user.setPassword(PasswordService.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }


}

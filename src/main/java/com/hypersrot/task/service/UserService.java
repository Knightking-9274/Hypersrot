package com.hypersrot.task.service;

import com.hypersrot.task.model.User;
import com.hypersrot.task.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        // You can implement additional logic here, such as validation
        return userRepository.save(user);
    }

}

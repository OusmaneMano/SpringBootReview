package com.ousmane.skillReview.service;

import com.ousmane.skillReview.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> getByEmail(String email);
    List<User> getAllByEmail();
    boolean existsByEmail(String email);

    User register(User user);

    List<User> getAllUser();

    User getUserById(Long id);

    void delete(Long id);
}

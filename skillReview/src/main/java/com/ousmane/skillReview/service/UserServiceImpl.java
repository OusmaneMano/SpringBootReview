package com.ousmane.skillReview.service;

import com.ousmane.skillReview.entity.User;
import com.ousmane.skillReview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public Optional<User> getByEmail(String email){
        return  userRepo.findByEmail(email);
    }
    @Override
    public List<User> getAllByEmail(){
        return userRepo.findAll();
    }

    @Override
    public User register(User user){
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long id){
        return userRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Not Found" + id));

    }

    @Override
    public void delete(Long id){
        userRepo.deleteById(id);

    }
    public boolean existsByEmail(String email){
        return userRepo.existsByEmail(email);
    }
}

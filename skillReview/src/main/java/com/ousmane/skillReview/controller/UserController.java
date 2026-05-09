package com.ousmane.skillReview.controller;

import com.ousmane.skillReview.entity.User;
import com.ousmane.skillReview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController{

    @Autowired
    public UserService userSer;

    @PostMapping
    public ResponseEntity<User> create (@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userSer.register(user));

    }
    @GetMapping
    public ResponseEntity<List<User>> getAllByEmail(){
        return ResponseEntity.ok(userSer.getAllUser());
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        return ResponseEntity.ok(userSer.getUserById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        userSer.delete(id);
        return ResponseEntity.noContent().build();
    }
}

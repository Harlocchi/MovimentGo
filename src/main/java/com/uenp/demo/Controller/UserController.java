package com.uenp.demo.Controller;

import com.uenp.demo.Models.Entity.User;
import com.uenp.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> allUsers = userService.findAll();
        return new ResponseEntity<>(allUsers, HttpStatus.ACCEPTED);
    }

    @PostMapping("")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User createdUser = userService.addUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> addUser(@PathVariable String id) {
        User userFind = userService.findById(id);
        return new ResponseEntity<>(userFind, HttpStatus.ACCEPTED);
    }

}

package com.uenp.demo.Services;

import com.uenp.demo.Models.Entity.User;
import com.uenp.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("ResearchRoom not found"));
    }

    public User updateById(String id, User newUser){
        User oldUser = userRepository.findById(id).get();
        oldUser.setName(newUser.getName());
        oldUser.setEmail(newUser.getEmail());
        oldUser.setInstituition(newUser.getInstituition());
        return userRepository.save(oldUser);
    }

    public void deleteById(String id) {
        userRepository.deleteById(id);
    }


}

package com.uenp.demo.Controller;

import com.uenp.demo.Models.Entity.Instituition;
import com.uenp.demo.Models.Entity.User;
import com.uenp.demo.Services.InstituitionService;
import com.uenp.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class InstituitionController {

    @Autowired
    InstituitionService instituitionService;

    @GetMapping("")
    public ResponseEntity<List<Instituition>> getAllInstituition() {
        List<Instituition> allUsers = instituitionService.getAllInstituitions();
        return new ResponseEntity<>(allUsers, HttpStatus.ACCEPTED);
    }

    @PostMapping("")
    public ResponseEntity<Instituition> addInstituition(@RequestBody Instituition instituition) {
        Instituition createdInstituuition = instituitionService.createInstituition(instituition);
        return new ResponseEntity<>(createdInstituuition, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instituition> findUser(@PathVariable String id) {
        Instituition instituition = instituitionService.getInstituitionById(id);
        return new ResponseEntity<>(instituition, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Instituition> deleteInstituition(@PathVariable String id) {
        instituitionService.deleteInstituition(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Instituition> updateUser(@PathVariable String id, @RequestBody Instituition user) {
        instituitionService.updateInstituition(id, user);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}

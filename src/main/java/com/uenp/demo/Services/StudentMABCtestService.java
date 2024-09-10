package com.uenp.demo.Services;

import com.uenp.demo.Models.Entity.Student;
import com.uenp.demo.Models.Entity.StudentMABCtest;
import com.uenp.demo.Repositories.StudentMABCtestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentMABCtestService {

    @Autowired
    StudentMABCtestRepository studentMABCtestRepository;




}

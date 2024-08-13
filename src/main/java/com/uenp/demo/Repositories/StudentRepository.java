package com.uenp.demo.Repositories;

import com.uenp.demo.Models.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}

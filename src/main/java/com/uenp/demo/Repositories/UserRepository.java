package com.uenp.demo.Repositories;

import com.uenp.demo.Models.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}

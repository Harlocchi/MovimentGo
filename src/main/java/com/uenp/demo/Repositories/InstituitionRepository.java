package com.uenp.demo.Repositories;

import com.uenp.demo.Models.Entity.Instituition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface InstituitionRepository extends MongoRepository<Instituition, String> {
}

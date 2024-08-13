package com.uenp.demo.Repositories;

import com.uenp.demo.Models.Entity.ResearchRoom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ResearchRoomRepository extends MongoRepository<ResearchRoom, String> {
}

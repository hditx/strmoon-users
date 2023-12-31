package com.stratosphere.strmoonusers.infrastructure.repositories;

import com.stratosphere.strmoonusers.infrastructure.repositories.entities.UserEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<UserEntity, ObjectId> {
}

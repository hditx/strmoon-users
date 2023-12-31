package com.stratosphere.strmoonusers.infrastructure.repositories.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserEntity {
    @Id
    private ObjectId id;
    private String name;
    private String password;

    private TypeAccount typeAccount;

}

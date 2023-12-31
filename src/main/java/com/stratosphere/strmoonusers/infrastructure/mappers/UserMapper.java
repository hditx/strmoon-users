package com.stratosphere.strmoonusers.infrastructure.mappers;


import com.stratosphere.strmoonusers.domain.entities.User;
import com.stratosphere.strmoonusers.infrastructure.repositories.entities.UserEntity;
import org.mapstruct.*;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        componentModel = "spring",
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {
    User mapToDomain(UserEntity userEntity);
}

package com.electronicbulling.bulling.repository;

import com.electronicbulling.bulling.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

    boolean existsByEmail(String email);
    User findByEmail(String email);

}

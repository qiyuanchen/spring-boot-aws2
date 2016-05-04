package com.example;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepo extends MongoRepository<user, String> {

    
    public user findByid(String id);
    public user findByuserName(String userName);
    
    

}
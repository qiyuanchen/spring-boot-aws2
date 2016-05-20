package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResultsRepo extends MongoRepository<Results, String> {

    
    public user findByid(String id);
    public void deleteByid(String id);
    

}

package com.example.portfolio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.portfolio.model.Profile;

public interface JpaRepository extends MongoRepository<Profile, String> {


}

package com.voterapi.demo.repo;

import com.voterapi.demo.entity.UsersEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UsersRepo extends MongoRepository<UsersEntity,String> {
    UsersEntity findByEmail(String email);
    boolean existsByEmail(String username);
    @Transactional
    void deleteByEmail(String username);
}

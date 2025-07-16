package com.example.restapi.repository;

import com.example.restapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
    Optional<User> findByEmail(String email); //Bu metodun amacı, veritabanındaki User tablosundan email adresine göre bir kullanıcıyı bulmaktır.



    List<User> findByNameContainingIgnoreCase(String name); //Bu method, veritabanındaki User tablosunda adı belirli bir kelimeyi içeren tüm kullanıcıları bulmak için kullanılır.
    
    boolean existsByEmail(String email);
}

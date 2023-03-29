package com.stc.tracnghiembe.repositories;

import com.stc.tracnghiembe.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

/**
 * Created by: IntelliJ IDEA
 * User      : thangpx
 * Date      : 3/15/23
 * Time      : 8:49 AM
 * Filename  : UserRepository
 */
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email);

    @Query(value = "{'email': ?0}")
    Optional<User> getUser(String email);

}

package com.example.CRESWAVE_CODE_TEST.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//An Interface responsible for data access
@Repository
public interface userRepository extends JpaRepository <user, Long> {

   // @Query("SELECT s FROM users s WHERE s.email=?1")
    Optional<user> findUserByEmail( String email);



}

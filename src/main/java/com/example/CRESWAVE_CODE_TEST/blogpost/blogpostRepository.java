package com.example.CRESWAVE_CODE_TEST.blogpost;

import com.example.CRESWAVE_CODE_TEST.user.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface blogpostRepository  extends JpaRepository <blogpost, Long>{

    Optional<blogpost> findAllById(Long BlogpostId);



    //Implimentation of th search functionality
    List<blogpost> findByTitleContainingIgnoreCase(String keyword);
    List<blogpost> findByContentContainingIgnoreCase(String keyword);




}

package com.example.CRESWAVE_CODE_TEST.user;



import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class userService {

    public List<user> getuser(){
        return List.of(
                new user(
                        1L,"Chris_Mamboleo2",
                        "sancristma@gmail.com","123456h"
                )

        );
    }



}

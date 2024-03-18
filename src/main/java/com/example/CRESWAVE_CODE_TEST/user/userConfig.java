package com.example.CRESWAVE_CODE_TEST.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
//setting up a bin
public class userConfig {
    @Bean
    CommandLineRunner commandLineRunner(userRepository repository){

        return  args -> {
            //Long id, String name, String username, String email , password
          user Chris= new user(

                    "Chris",
                    "leo",
                    "sancristma@gmail.com","123456h"
            );
          user Mamboleo=new user(

                    "Mamboleo",
                    "sunny",
                    "ma@gmail.com","123456h"

            );
            repository.saveAll(
                   List.of(Chris, Mamboleo)
            );

        };
    }


}

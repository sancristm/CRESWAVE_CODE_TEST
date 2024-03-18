package com.example.CRESWAVE_CODE_TEST.user;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class userService {
    private final userRepository userRepository;
    @Autowired
    public  userService(userRepository userRepository){
        this.userRepository= userRepository;
    }

    public List<user> getusers(){
        return userRepository.findAll();



    }
    //vallidations || conditions BASIC
    public void addNewUser(user user){
       Optional<user> userOptional=userRepository.findUserByEmail(user.getEmail());
       if(userOptional.isPresent()){
           throw new IllegalStateException(" user already exists");
       }
       userRepository.save(user);

        //System.out.println(user);

    }



}

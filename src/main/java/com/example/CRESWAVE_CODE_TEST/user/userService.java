package com.example.CRESWAVE_CODE_TEST.user;



import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;
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
    //validations || conditions BASIC
    public void addNewUser(user user){
       Optional<user> userOptional=userRepository.findUserByEmail(user.getEmail());
       if(userOptional.isPresent()){
           throw new IllegalStateException(" user already exists with that email address");
       }
       userRepository.save(user);

       System.out.println(user);

    }
    public void deleteUser(Long userId){
        boolean exists= userRepository.existsById(userId);
        if(!exists){
            throw new IllegalStateException("user with that id" +userId +" does not exist");

        }
        userRepository.deleteById(userId);

    }
    @Transactional
    //update only usernme and name
    public void updateUser(Long userId, String username, String name){
        user user= userRepository.findById(userId).orElseThrow(() -> new IllegalStateException("user with that id" +userId +" does not exist"));

        if (name !=null && name.length() > 0 &&
                !Objects.equals(user.getName(),name)){
            user.setName(name);
        }
        if (username !=null && username.length() > 0 &&
                !Objects.equals(user.getUsername(),username)){
            user.setUsername(username);
        }


//        if (email !=null && email.length() > 0 &&
//                !Objects.equals(user.getEmail(),email)){
//
//            Optional<user> userOptional=userRepository.findUserByEmail(user.getEmail());
//            if(userOptional.isPresent()){
//                throw new IllegalStateException(" user already exists with that email address");
//            }
//            user.setEmail(email);
//        }


    }



}

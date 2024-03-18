package com.example.CRESWAVE_CODE_TEST.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user/")
public class userController {

    private final userService userService;

    @Autowired
    public userController(userService userService) {
        this.userService= userService;
    }

    @GetMapping
    public List<user> getusers(){
        return userService.getusers();

    }

//    @PostMapping
//    public void registerNewUser(@RequestBody user user){
//        userService.addNewUser(user);
//    }
   // @PostMapping("/api/v1/user")
//    public ResponseEntity<String> registerNewUser(@RequestBody user user) {
//        try {
//            userService.addNewUser(user);
//            return ResponseEntity.status(HttpStatus.CREATED).body("User added successfully");
//        } catch (IllegalStateException e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
//        }
//    }
    @PostMapping
    public ResponseEntity<String>registerNewUser(@RequestBody user user){
        try {
            userService.addNewUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body("User added successfully");
        }catch (IllegalStateException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}

package com.example.CRESWAVE_CODE_TEST.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class userController {

    private final userService userService;

    @Autowired
    public userController(userService userService) {
        this.userService= userService;
    }

    @GetMapping
    public List<user> getUsers(){
        return userService.getusers();

    }

    @PostMapping
    public void registerNewUser(@RequestBody user user){
        userService.addNewUser(user);
    }

}

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


    @PostMapping
    public ResponseEntity<String>registerNewUser(@RequestBody user user){
        try {
            userService.addNewUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body("User added successfully");
        }catch (IllegalStateException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }
    @PutMapping(path = "{userId}")
    public void updateUser(
            @PathVariable("userId") Long userId,
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String name)
            //@RequestParam(required = false) String email)
            {
        userService.updateUser( userId,username, name);
    }


}

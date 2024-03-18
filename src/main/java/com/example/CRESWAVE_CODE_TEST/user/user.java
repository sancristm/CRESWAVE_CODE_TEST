package com.example.CRESWAVE_CODE_TEST.user;

import jakarta.persistence.*;

//mapping a user class to a table
@Entity //for Hibernate
@Table(name = "Credentials")
public class user{
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )


    private Long id;
    private String name;
    private  String username;
    private String email;
    private String password;

    public user(){

    }



    public user  (Long id, String name, String username, String email, String password)
    {
        this.id = id;
        this.name= name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public user(String name, String username, String email, String password) {

        this.name= name;
        this.username = username;
        this.email = email;
        this.password =password;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


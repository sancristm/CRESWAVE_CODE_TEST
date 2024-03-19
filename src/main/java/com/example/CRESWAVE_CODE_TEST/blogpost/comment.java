package com.example.CRESWAVE_CODE_TEST.blogpost;


import com.example.CRESWAVE_CODE_TEST.user.user;
import jakarta.persistence.*;

public class comment {
//    @Id
//    @GeneratedValue( strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String text;
//    @ManyToOne
//    @JoinColumn(name= "userId")
//    private user;

    @ManyToOne
    @JoinColumn( name = "BlogpostId")
    private blogpost post;



    public  comment(){

    }



}

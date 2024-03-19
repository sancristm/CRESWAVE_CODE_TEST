package com.example.CRESWAVE_CODE_TEST.blogpost;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "Posts")

public class blogpost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long BlogpostId;
    private String title;

    private String content;

    private LocalDate datePosted;

    private String comment;

    public blogpost(){

    }


    public blogpost(Long blogpostId) {
        BlogpostId = blogpostId;
    }

    public blogpost(Long BlogpostId, String title, String content, String comment, LocalDate datePosted) {
        this.BlogpostId= BlogpostId;
        this.title = title;
        this.content = content;
        this.comment=comment;
        this.datePosted= datePosted;

    }



    public Long getBlogpostId() {
        return BlogpostId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getComment() {
        return comment;
    }

    public LocalDate getDatePosted() {
        return datePosted;
    }

    public void setId(Long BlogpostId) {
        this.BlogpostId =BlogpostId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDatePosted(LocalDate datePosted) {
      //  return datePosted( LocalDate.now());

       this.datePosted = LocalDate.now();
    }

    @Override
    public String toString() {
        return "blogpost{" +
                "BlogpostId=" + BlogpostId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", datePosted=" + datePosted +
                ", comment='" + comment + '\'' +
                '}';
    }
}

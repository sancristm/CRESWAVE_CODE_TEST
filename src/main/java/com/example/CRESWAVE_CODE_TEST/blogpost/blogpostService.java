package com.example.CRESWAVE_CODE_TEST.blogpost;


import com.example.CRESWAVE_CODE_TEST.user.user;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class blogpostService {

    private final blogpostRepository blogpostRepository;

    @Autowired
    public  blogpostService (blogpostRepository blogpostRepository){
        this.blogpostRepository=blogpostRepository;

    }

    public List<blogpost>getblogpost(){
        return blogpostRepository.findAll();

    }
    public void postNewBlog(blogpost blogpost){
        Optional<blogpost> userOptional=blogpostRepository.findAllById(blogpost.getBlogpostId());
        if(userOptional.isPresent()){
            throw new IllegalStateException(" post already exists with that id");
        }
        blogpostRepository.save(blogpost);

        System.out.println(blogpost);

    }

    public void deleteBlogpost(Long BlogpostId){
        boolean exists=blogpostRepository.existsById(BlogpostId);
        if(!exists){
            throw new IllegalStateException("post with that id" +BlogpostId +" does not exist");

        }
        blogpostRepository.deleteById(BlogpostId);

    }
    @Transactional

    public void updateBlogpost(Long BlogpostId, String title, String content) {
        blogpost blogpost = blogpostRepository.findById(BlogpostId).orElseThrow(() -> new IllegalStateException("post with that id" + BlogpostId + " does not exist"));

        if (title != null && title.length() > 0 &&
                !Objects.equals(blogpost.getTitle(), title)) {
            blogpost.setTitle(title);
        }
        if (content != null && content.length() > 0 &&
                !Objects.equals(blogpost.getContent(), content)) {
            blogpost.setContent(content);
        }
    }

    // Method to search for blog posts by title
    public List<blogpost> searchByTitle(String keyword) {
        return blogpostRepository.findByTitleContainingIgnoreCase(keyword);
    }

    // Method to search for blog posts by content
    public List<blogpost> searchByContent(String keyword) {
        return blogpostRepository.findByContentContainingIgnoreCase(keyword);
    }



    }

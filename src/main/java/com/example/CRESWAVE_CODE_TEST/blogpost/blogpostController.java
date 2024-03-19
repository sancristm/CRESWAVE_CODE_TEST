package com.example.CRESWAVE_CODE_TEST.blogpost;


import com.example.CRESWAVE_CODE_TEST.user.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/blogs/")
public class blogpostController {

    private  final blogpostService blogpostService;

    @Autowired
    public blogpostController( blogpostService blogpostService){
        this.blogpostService= blogpostService;

    }
  @GetMapping
  public List<blogpost> getblogposts(){
      return blogpostService.getblogpost();

  }

    @PostMapping
    public ResponseEntity<String>postNewBlog(@RequestBody blogpost blogpost){
        try {
            blogpostService.postNewBlog(blogpost);
            return ResponseEntity.status(HttpStatus.CREATED).body("Blogpost  added successfully");
        }catch (IllegalStateException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
    @DeleteMapping(path = "{BlogpostId}")
    public void deleteUser(@PathVariable("BlogpostId") Long BlogpostId){
        blogpostService.deleteBlogpost(BlogpostId);
    }
    @PutMapping(path = "{BlogpostId}")
    public void updateUser(
            @PathVariable("BlogpostId") Long BlogpostId,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String content)
    //@RequestParam(required = false) String email)
    {
        blogpostService.updateBlogpost( BlogpostId,title,content);
    }

    // Endpoint to search for blog posts by title
    @GetMapping("/searchByTitle")
    public List<blogpost> searchByTitle(@RequestParam String keyword) {
        return blogpostService.searchByTitle(keyword);
    }

    // Endpoint to search for blog posts by content
    @GetMapping("/searchByContent")
    public List<blogpost> searchByContent(@RequestParam String keyword) {
        return blogpostService.searchByContent(keyword);
    }


}

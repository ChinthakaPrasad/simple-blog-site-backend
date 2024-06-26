package edu.lumizec.blog.controller;

import edu.lumizec.blog.entity.Post;
import edu.lumizec.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    Post createPost(@RequestBody Post post){
        return postService.savePost(post);
    }
}

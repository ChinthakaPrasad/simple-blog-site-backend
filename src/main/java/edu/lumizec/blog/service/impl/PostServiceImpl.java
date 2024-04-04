package edu.lumizec.blog.service.impl;

import edu.lumizec.blog.entity.Post;
import edu.lumizec.blog.repository.PostRepository;
import edu.lumizec.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post){
        post.setLikeCount(0);
        post.setViewCount(0);

        return postRepository.save(post);
    }
}

package com.codepresso.team2app.service;

import com.codepresso.team2app.mapper.PostMapper;
import com.codepresso.team2app.vo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostMapper postMapper;

    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public boolean savePost(Post post){
        Integer result = postMapper.save(post);
        return result == 1;
    }

    public List<Post> getAllPost() {
        return postMapper.findAllPost();
    }
}

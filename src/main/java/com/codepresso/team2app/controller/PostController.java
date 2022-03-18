package com.codepresso.team2app.controller;

import com.codepresso.team2app.controller.dto.PostRequestDto;
import com.codepresso.team2app.controller.dto.PostResponseDto;
import com.codepresso.team2app.service.PostService;
import com.codepresso.team2app.vo.Post;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/post")
    public String createPost(@RequestBody @Validated PostRequestDto postRequestDto) {
        Post post = postRequestDto.getPost();
        postService.savePost(post);

        return "success";
    }

    @GetMapping("/post/all")
    public List<PostResponseDto> getAllPostList() {
        List<Post> postList = postService.getAllPost();
        List<PostResponseDto> postResponseDtos = new ArrayList<>();
        for(Post post : postList){
            postResponseDtos.add(new PostResponseDto(post));
        }
        return postResponseDtos;
    }
}

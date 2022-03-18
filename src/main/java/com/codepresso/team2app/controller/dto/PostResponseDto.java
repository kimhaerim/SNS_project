package com.codepresso.team2app.controller.dto;

import com.codepresso.team2app.vo.Post;
import lombok.Getter;

import java.util.Date;

@Getter
public class PostResponseDto {
    Long id;
    Long author;
    String title;
    String content;

    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.author = post.getAuthor();
        this.title = post.getTitle();
        this.content =post.getContent();
    }
}

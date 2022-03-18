package com.codepresso.team2app.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Post {
    Long id;
    Long author;
    String title;
    String content;
    Date createdAt;
    Long count_liked;
    Long count_revogel;
    Long count_comment;
    Long revogel_post_id;

    public Post(Long id, Long author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
    }
}

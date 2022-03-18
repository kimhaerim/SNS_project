package com.codepresso.team2app.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HashTag {
    Long id;
    Long tag_name;
    Long user_id;
    Long post_id;

    public HashTag(Long id, Long tag_name, Long user_id, Long post_id) {
        this.id = id;
        this.tag_name = tag_name;
        this.user_id = user_id;
        this.post_id = post_id;
    }
}

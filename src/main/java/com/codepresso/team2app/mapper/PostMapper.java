package com.codepresso.team2app.mapper;

import com.codepresso.team2app.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
    Integer save(@Param("post") Post post);
    List<Post> findAllPost();
}

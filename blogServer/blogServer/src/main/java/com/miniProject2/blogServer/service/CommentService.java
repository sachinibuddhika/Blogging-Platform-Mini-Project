package com.miniProject2.blogServer.service;

import com.miniProject2.blogServer.entity.Comment;

import java.util.List;

public interface CommentService {

    Comment createComment(Long postId, String postedBy , String content);
    List<Comment> getCommentByPostId(Long postId);

}

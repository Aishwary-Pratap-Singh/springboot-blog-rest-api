package com.example.springbootblogrestapi.service;

import com.example.springbootblogrestapi.payload.CommentDto;

import java.util.List;

public interface CommentService {

    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentByPPostId(long postId);
}
